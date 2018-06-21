package com.tuacy.room;

import android.app.Application;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.migration.Migration;

import com.tuacy.room.database.AppDatabase;

public class AppApplication extends Application {

	private AppDatabase mAppDatabase;

	@Override
	public void onCreate() {
		super.onCreate();
		mAppDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "android_room_dev.db")
						   .allowMainThreadQueries()
						   .addMigrations(MIGRATION_1_2, MIGRATION_2_3)
						   .build();
	}

	public AppDatabase getAppDatabase() {
		return mAppDatabase;
	}

	/**
	 * 数据库版本 1->2 user表格新增了age列
	 */
	static final Migration MIGRATION_1_2 = new Migration(1, 2) {
		@Override
		public void migrate(SupportSQLiteDatabase database) {
			database.execSQL("ALTER TABLE User ADD COLUMN age integer");
		}
	};

	/**
	 * 数据库版本 2->3 新增book表格
	 */
	static final Migration MIGRATION_2_3 = new Migration(2, 3) {
		@Override
		public void migrate(SupportSQLiteDatabase database) {
			database.execSQL(
				"CREATE TABLE IF NOT EXISTS `book` (`uid` INTEGER PRIMARY KEY autoincrement, `name` TEXT , `userId` INTEGER, 'time' INTEGER)");
		}
	};
}

package com.tuacy.room.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.tuacy.room.database.daos.BookDao;
import com.tuacy.room.database.daos.UserDao;
import com.tuacy.room.database.entities.Book;
import com.tuacy.room.database.entities.User;

@Database(entities = {User.class,
					  Book.class}, version = 3)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

	public abstract UserDao userDao();

	public abstract BookDao bookDao();

}

package com.tuacy.room.database.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.tuacy.room.database.entities.User;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface UserDao {

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	List<Long> insert(User... users);

	@Query("SELECT * from user")
	Flowable<List<User>> loadUser();


}

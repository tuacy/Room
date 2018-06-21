package com.tuacy.room.database.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.tuacy.room.database.entities.Book;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface BookDao {

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	List<Long> insert(Book... books);

	@Query("SELECT * from book")
	Flowable<List<Book>> load();

}

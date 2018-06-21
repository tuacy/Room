package com.tuacy.room.database.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity
public class Book {

	@PrimaryKey(autoGenerate = true)
	private Long   uid;
	private String name;
	private Date   time;
	private Long   userId;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Book{" + "uid=" + uid + ", name='" + name + '\'' + ", time=" + time + ", userId=" + userId + '}';
	}
}

package com.tuacy.room.database.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {

	@PrimaryKey
	public String firstName;
	@PrimaryKey
	public String lastName;
}

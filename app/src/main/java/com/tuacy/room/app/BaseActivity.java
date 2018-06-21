package com.tuacy.room.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.room.AppApplication;
import com.tuacy.room.database.AppDatabase;

public abstract class BaseActivity extends AppCompatActivity {

	protected Context mContext;
	protected AppDatabase mAppDatabase;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = this;
		mAppDatabase = ((AppApplication)getApplication()).getAppDatabase();
	}
}

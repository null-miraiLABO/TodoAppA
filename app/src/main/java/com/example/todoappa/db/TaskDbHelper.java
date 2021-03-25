package com.example.todoappa.db;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbHelper extends SQLiteOpenHelper {
    public TaskDbHelper(Context context){
        super(context,TaskContract.DB_NAME,null,TaskContract.DB_VERSION);
    }

    
}

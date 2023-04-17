package com.example.compaynion;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler
{
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
    public class DBHelper extends SQLiteOpenHelper
    {
        static String DATABASE_NAME="Compaynion";
        public static final String TABLE_NAME="student";
        public static final String Table_Column_ID="id";
        public static final String Table_Column_RollNo="rollno";
        public static final String Table_Column_Name="name";
        public static final String Table_Column_Class="class";
        public DBHelper(Context context)
        {
            super(context, DATABASE_NAME, null, 1);
        }
        @Override
        public void onCreate(SQLiteDatabase database)
        {
            String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Column_ID+" INTEGER PRIMARY KEY, "+Table_Column_RollNo+" VARCHAR,  "+Table_Column_Name+" VARCHAR, "+Table_Column_Class+" VARCHAR)";  database.execSQL(CREATE_TABLE);
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)  {
            db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
            onCreate(db);
        }
    }

}

package com.example.compaynion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper
{
    public static final String DBNAME="Compaynion.db";

    public DBHelper( Context context) {
        super(context, "Compaynion.db" , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS users");
    }

    public Boolean checkusernamepassword (String username, String password)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from users where username= ? and password= ?", new String[] {username,password});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }


}

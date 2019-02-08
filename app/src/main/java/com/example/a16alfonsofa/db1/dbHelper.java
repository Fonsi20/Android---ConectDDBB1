package com.example.a16alfonsofa.db1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a16alfonsofa on 08/02/2019.
 */

public class dbHelper extends SQLiteOpenHelper {

    String SQLCrear = "CREATE TABLE tUsuarios(codigo INTEGER PRIMARY KEY, nombre VARCHAR(45))";
    String SQLEliminar = "DROP TABLE IF EXISTS tUsuarios";

    public dbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQLCrear);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        db.execSQL(SQLEliminar);

    }
}

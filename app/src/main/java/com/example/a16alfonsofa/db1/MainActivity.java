package com.example.a16alfonsofa.db1;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String BDName;
    private int DBVersion;
    private SQLiteDatabase DBUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BDName = "BDUsuarios";
        DBVersion = 1;

        dbHelper DBHelper = new dbHelper(this, BDName, null, DBVersion);

        DBUsuario = DBHelper.getWritableDatabase();
        //DBUsuario.execSQL("INSERT INTO tUsuarios (codigo,nombre) values (4,'Leonor del monte'),(5,'Me duele el mundo'),(6,'Diego')");
        DBUsuario.close();

    }
}

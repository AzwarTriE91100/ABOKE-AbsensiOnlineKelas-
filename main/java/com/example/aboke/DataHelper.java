package com.example.aboke;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.content.ContentValues;

public class DataHelper<sql> extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "akademik.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table mahasiswa(nim integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        //insert data dummy
        sql = "INSERT INTO mahasiswa (nim, nama, tgl, jk, alamat) VALUES (3411181132, 'Azwar Tri Endrayadi', '2000-11-09', 'Laki-laki','Garut');";
        db.execSQL(sql);
        sql = "INSERT INTO mahasiswa (nim, nama, tgl, jk, alamat) VALUES (3411181140, 'Yesi Sofia', '2020-07-11', 'Perempuan','Cimahi');";
        db.execSQL(sql);
        sql = "INSERT INTO mahasiswa (nim, nama, tgl, jk, alamat) VALUES (3411181147, 'Angga Putera R', '2000-07-11', 'Laki-laki','Cimahi');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}

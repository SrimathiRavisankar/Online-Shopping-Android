package com.example.flipcart;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by ctslab on 9/8/16.
 */
class MyDbHandler extends SQLiteOpenHelper {
    public MyDbHandler(Context x) {
        super(x, "customer7.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String q = "create table cart7 " + "(name text,rs text)";
        db.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insert(String name, String rs) {
        SQLiteDatabase db = this.getWritableDatabase();
        String qu = "insert into cart7 (name,rs) values('" + name + "','" + rs+ "')";
        db.execSQL(qu);
    }

    public ArrayList<String> displayall() {
        ArrayList<String> array_list = new ArrayList<String>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from cart7", null);
        int sum=0;
        if (res.moveToFirst()) {
            do {
                array_list.add(res.getString(0)+" "+res.getString(1));
                //sum+=Integer.valueOf(res.getString(1));
                //array_list.add(res.getString(1));
                //array_list.add(res.getString(2));
                //array_list.add(res.getString(3));
                //array_list.add(res.getString(4));
                //array_list.add("\n");
                //array_list.add(res.getString(5));
            } while (res.moveToNext());
        }
        //array_list.add(String.valueOf(sum));
        return array_list;
    }
    public void delete(){
    	
    	 SQLiteDatabase db = this.getWritableDatabase();
         String qu ="drop cart7";
         db.execSQL(qu);
	

    	
    }
}
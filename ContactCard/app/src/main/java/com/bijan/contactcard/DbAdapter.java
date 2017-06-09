package com.bijan.contactcard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bijan on 6/3/2015.
 */
public class DbAdapter {
    //constant variables that describes database name, versions, etc ...
    private static final String DB_NAME="contact.sqlite";
    private static final int DB_VERSION=1;
    private MyDbHelper myDbHelper;
    private SQLiteDatabase db;

    //constructor
    public DbAdapter(Context context) {
        myDbHelper = new MyDbHelper(context);
    }

    public void open(){
        //readwrite mode
        db = myDbHelper.getWritableDatabase();
    }

    public void close(){
        db.close();
    }
    //insert method
    public void insertPerson(String name, String add, long phone){
        //ContentValues prevent sql injection
        ContentValues cv = new ContentValues();
        cv.put("fullname", name);
        cv.put("address", add);
        cv.put("phone", phone);
        db.insert("person","fullname", cv);
    }
    //retrive method
    public List<Person> getAllPerson(){
        Cursor cu = db.query("person",new String[]{"fullname","address","phone"},null,null,null,null,null);
        cu.moveToFirst();
        List<Person> personList = new ArrayList<Person>();
        while (cu.moveToNext()){
            Person person = new Person();
            person.setName(cu.getString(cu.getColumnIndex("fullname")));
            person.setAddress(cu.getString(cu.getColumnIndex("address")));
            person.setPhone(cu.getLong(cu.getColumnIndex("phone")));
            personList.add(person);
        }
        return personList;
    }
    //inner class that extends the SQLiteOpenHelper Class
    public class MyDbHelper extends SQLiteOpenHelper {

        public MyDbHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE person(_pid INTEGER PRIMARY KEY AUTOINCREMENT, fullname TEXT, address TEXT, phone INTEGER)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}

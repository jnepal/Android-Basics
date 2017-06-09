package np.com.sabinb.loadsheddingdemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sabin on 6/8/2015.
 */
public class DbAdapter {
    private static final String DB_NAME = "loadshedding.sqlite";
    private static final int DB_VERSION = 1;
    private MyDbHelper myDbHelper;
    private SQLiteDatabase database;

    public DbAdapter(Context context){
        myDbHelper = new MyDbHelper(context);
    }

    public void open(){
        try{
           database = myDbHelper.getWritableDatabase();
        }catch (SQLiteException e){
            e.printStackTrace();;
        }
    }
    public void close(){
        database.close();
    }
    public void insert(int group, String day, String morningTime, String eveningTime){
        ContentValues contentValues = new ContentValues();
        contentValues.put("group", group);
        contentValues.put("day", day);
        contentValues.put("morningTime", morningTime);
        contentValues.put("eveningTime", eveningTime);
        database.insert("loadshedding", "day", contentValues);

    }
    public List<Loadshedding>fetchAll(){
        Cursor cursor = database.query("loadshedding", new String[]{"day","morningTime","eveningTime"},null,null,null,null,null,null);
        cursor.moveToFirst();
        List<Loadshedding>loadsheddingList = new ArrayList<>();
        Loadshedding loadshedding = new Loadshedding();
        while(cursor.moveToNext()){
            loadshedding.setDay(cursor.getString(cursor.getColumnIndex("day")));
            loadshedding.setEveningTime(cursor.getString(cursor.getColumnIndex("eveningTime")));
            loadshedding.setMorningTime(cursor.getString(cursor.getColumnIndex("morningTime")));

            loadsheddingList.add(loadshedding);
        }
        return loadsheddingList;

    }

    private class MyDbHelper extends SQLiteOpenHelper{

        public MyDbHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
           database.execSQL("CREATE TABLE loadshedding(_id INTEGER PRIMARY KEY AUTOINCREMENT,group INTEGER,day TEXT,morningTime TEXT,eveningTime TEXT)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

}


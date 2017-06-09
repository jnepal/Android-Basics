package np.com.sabinb.databasedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sabin on 6/3/2015.
 */
public class DbAdapter {
    private static final String DB_Name = "employee.sqlite";
    private static final int DB_VERSION = 1;
    private MyDbHelper myDbHelper;
    private SQLiteDatabase database;

    public DbAdapter(Context context) {
        myDbHelper = new MyDbHelper(context);
    }

    public void open(){
        try{
            database = myDbHelper.getWritableDatabase();
        }
        catch(SQLiteException ex){
            ex.printStackTrace();
        }

    }

    public void close(){
        database.close();
    }

    private class MyDbHelper extends SQLiteOpenHelper{
        private MyDbHelper(Context context) {
            super(context, DB_Name, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE employee(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, address TEXT, age INTEGER)");
        //ContentValue Handles the SQL Injection
            ContentValues contentValue = new ContentValues();
            contentValue.put("name", "Ram Krishna");
            contentValue.put("address", "Kathmandu");
            contentValue.put("age", 24);

            db.insert("employee", "address", contentValue);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}

package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.persistent.contracts.AccountContract;

/**
 * Created by Madhawa on 03/12/2015.
 */
public class SQLLiteHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "test.db";

    private static SQLLiteHelper instance = null;


    private  static final String[] SQL_CREATE_ENTRIES = {"CREATE TABLE IF NOT EXISTS " + AccountContract.AccountEntry.TABLE_NAME +
            " (" + AccountContract.AccountEntry.COLUMN_NAME_ACCOUNT_NO + " VARCHAR(20) PRIMARY KEY, " +
            AccountContract.AccountEntry.COLUMN_NAME_ACCOUNT_HOLDER_NAME  + " VARCHAR(50), " +
            AccountContract.AccountEntry.COLUMN_NAME_BANK_NAME + " VARCHAR (50), "+
            AccountContract.AccountEntry.COLUMN_NAME_BALANCE + " DECIMAL(10,2) )" };
    private static final String[] SQL_DELETE_ENTRIES = {"DROP TABLE IF EXIST " + AccountContract.AccountEntry.TABLE_NAME};




    public static SQLLiteHelper getInstance(Context context)
    {
        if(instance == null)
            instance = new SQLLiteHelper(context);
        return instance;
    }

    private SQLLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        for(String s : SQL_CREATE_ENTRIES)
        {
            db.execSQL(s);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //we will simply discard old data for now
        for(String s : SQL_DELETE_ENTRIES)
        {
            db.execSQL(s);
        }
        onCreate(db);
    }
}

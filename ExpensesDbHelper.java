package com.example.helloworldxt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExpensesDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Expenses.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + ExpensesContract.ExpensesEntry.TABLE_NAME + " (" +
                    ExpensesContract.ExpensesEntry._ID + " INTEGER PRIMARY KEY," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_MONTH + " TEXT," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_HOUSING + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_TRANSPORTATION + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_TRAVEL_EXPENSES + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_FOOD_AND_GROCERIES + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_UTILITY_BILLS + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_PET_FOOD_AND_CARE + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_CLOTHING + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_MEMBERSHIPS_AND_SUBSCRIPTIONS + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_ENTERTAINMENTS + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_LOANS + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_RETIREMENT + " INTEGER," +
                    ExpensesContract.ExpensesEntry.COLUMN_NAME_EMERGENCY_FUND + " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ExpensesContract.ExpensesEntry.TABLE_NAME;

    public ExpensesDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}

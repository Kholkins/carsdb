package Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import Utils.Util;

public class DatabaseHandler extends SQLiteOpenHelper {
    public DatabaseHandler( Context context) {
        super(context, Util.DATABASE_NAME,null, Util.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CARS_TABLE = "CREATE TABLE "+ Util.DATABASE_NAME+"("
                +Util.KEY_ID+" INTEGER PRIMARY KEY,"
                +Util.KEY_NAME+" TEXT,"
                +Util.KEY_PRICE+" TEXT"+")";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

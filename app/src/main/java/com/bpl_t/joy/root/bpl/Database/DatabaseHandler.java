package com.bpl_t.joy.root.bpl.Database;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.List;

/**
 * Created by root on 10/14/17.
 */

public class DatabaseHandler extends SQLiteOpenHelper {
    Context context;


    private static final int DATABASE_VERSION = 1;

    // Database Name
    public static final String DATABASE_NAME = "BPLDatabase";

    //table name
    public static final String TABLE_Team_Info = "TeamInfo";
    public static final String TABLE_PLAYER_INFO="PlayerInfo";

    //table content #1
    public static final String KEY_TEAM_ID = "teamid";
    public static final String KEY_TEAM_NAME= "teamName";
    public static final String KEY_TEAM_ABOUT = "teamAbout";
    public static final int KEY_TEAM_PHOTO_ID = 0;

    //table content #2
    public static final String KEY_ID="playerID";
    public static final String KEY_PLAYER_NAME="playerName";
    public static final String KEY_PLAYER_ABOUT="playerAbout";
    public static final String KEY_PLAYER_CARRIER="carrier";
    public static final String KEY_PLAYER_TEAM_NAME="teamName";
    public static final String KEY_PLAYER_COUNTRY="playerCountry";
    public static final int KEY_PLAYER_PHOTO_ID=0;


    public DatabaseHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.context=context;
    }

      //for security purpose

  /*  void get_PlayerTableDataAcess(String id,String playerName,String playerAbout,String playerCarrier,String playerTeamName,String playerCountry,int playerPhotoId){

        id=KEY_ID;
        playerName=KEY_PLAYER_NAME;
        playerAbout=KEY_PLAYER_ABOUT;
        playerCarrier=KEY_PLAYER_CARRIER;
        playerTeamName=KEY_PLAYER_TEAM_NAME;
        playerCountry=KEY_PLAYER_COUNTRY;
        playerPhotoId=KEY_PLAYER_PHOTO_ID;



    }
    void get_TeamTableDataAcess(String id,String teamName,String teamAbout,int teamPhotoID){
        id=KEY_TEAM_ID;
        teamName=KEY_TEAM_NAME;
        teamAbout=KEY_TEAM_ABOUT;
        teamPhotoID=KEY_TEAM_PHOTO_ID;
    }*/



    @Override
    public void onCreate(SQLiteDatabase db) {

        //TABLE #1
        String TEAM_INFO_TABLE = "CREATE TABLE "
                + TABLE_Team_Info
                + "("
                + KEY_TEAM_ID + " INTEGER PRIMARY KEY,"
                + KEY_TEAM_NAME + " TEXT,"
                + KEY_TEAM_ABOUT + " TEXT,"
                + KEY_TEAM_PHOTO_ID+"INT"
                + ")";
        //TABLE #2
        String PLAYERS_INFO_TABLE = "CREATE TABLE "
                + TABLE_PLAYER_INFO
                + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_PLAYER_NAME + " TEXT,"
                + KEY_PLAYER_ABOUT + " TEXT,"
                + KEY_PLAYER_CARRIER+"TEXT,"
                + KEY_PLAYER_COUNTRY+"TEXT"
                + KEY_PLAYER_TEAM_NAME+"TEXT,"
                + KEY_PLAYER_PHOTO_ID+"INT"
                + ")";

        db.execSQL(TEAM_INFO_TABLE);
        Toast.makeText(context,"table 1 created",Toast.LENGTH_SHORT).show();

        db.execSQL(PLAYERS_INFO_TABLE);
        Toast.makeText(context,"table 2 created",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // Drop older table if existed

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Team_Info);

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PLAYER_INFO);

        // Create tables again
        onCreate(db);

    }
}


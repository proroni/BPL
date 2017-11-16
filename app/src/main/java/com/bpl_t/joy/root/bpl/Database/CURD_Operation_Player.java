package com.bpl_t.joy.root.bpl.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.bpl_t.joy.root.bpl.MainActivity;

import java.util.ArrayList;
import java.util.List;

import static com.bpl_t.joy.root.bpl.Database.DatabaseHandler.KEY_ID;
import static com.bpl_t.joy.root.bpl.Database.DatabaseHandler.TABLE_PLAYER_INFO;

/**
 * Created by root on 10/15/17.
 */

public class CURD_Operation_Player {
    Context context;
    DatabaseHandler databasehandler=new DatabaseHandler(context);




        // Adding new contact
        public void addPlayer(PlayersConnector playersConnector) {

            SQLiteDatabase db = databasehandler.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(databasehandler.KEY_ID,playersConnector.getid());
            values.put(databasehandler.KEY_PLAYER_NAME, playersConnector.getPlayerName());
            values.put(databasehandler.KEY_PLAYER_ABOUT, playersConnector.getPlayerAbout());
            values.put(databasehandler.KEY_PLAYER_CARRIER,playersConnector.getPlayerCarrier());
            values.put(databasehandler.KEY_PLAYER_COUNTRY, playersConnector.getPlayerCountry());
            values.put(databasehandler.KEY_PLAYER_TEAM_NAME, playersConnector.getPlayerteam());
            values.put(String.valueOf(databasehandler.KEY_TEAM_PHOTO_ID), playersConnector.getplayerPhotoId());


            // Inserting Row
            db.insert(databasehandler.TABLE_PLAYER_INFO, null, values);
            db.close(); // Closing database connection
        }

        // Getting single contact
        public PlayersConnector getPlayer(int id) {
            SQLiteDatabase db = databasehandler.getReadableDatabase();

            Cursor cursor = db.query(databasehandler.TABLE_PLAYER_INFO, new String[] {
                            databasehandler.KEY_ID,
                            databasehandler.KEY_PLAYER_NAME,
                            databasehandler.KEY_PLAYER_ABOUT,
                            databasehandler.KEY_PLAYER_CARRIER,
                            databasehandler.KEY_PLAYER_COUNTRY,
                            databasehandler.KEY_PLAYER_TEAM_NAME,
                            String.valueOf(databasehandler.KEY_TEAM_PHOTO_ID),
                            },
                            KEY_ID + "=?",
                    new String[] { String.valueOf(id) }, null, null, null, null);
            if (cursor != null)
                cursor.moveToFirst();

            PlayersConnector playerConnector = new PlayersConnector(Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    Integer.parseInt(cursor.getString(6))
            );



            // return contact
            return playerConnector;

        }

        // Getting All Contacts
        public List<PlayersConnector> getAllPlayer() {
            List<PlayersConnector> playersList = new ArrayList<PlayersConnector>();
            // Select All Query
            String selectQuery = "SELECT  * FROM " + TABLE_PLAYER_INFO;

            SQLiteDatabase db = databasehandler.getWritableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);

            // looping through all rows and adding to list
            if (cursor.moveToFirst()) {
                do {
                    PlayersConnector playersConnector = new PlayersConnector();
                    playersConnector.setid(Integer.parseInt(cursor.getString(0)));
                    playersConnector.setPlayerName(cursor.getString(1));
                    playersConnector.setPlayerAbout(cursor.getString(2));
                    playersConnector.setPlayerCarrier(cursor.getString(3));
                    playersConnector.setPlayerCountry(cursor.getString(4));
                    playersConnector.setPlayerteam(cursor.getString(5));
                    playersConnector.setplayerPhotoId(Integer.parseInt(cursor.getString(6)));
                    // Adding contact to list
                    playersList.add(playersConnector);
                } while (cursor.moveToNext());
            }

            // return contact list
            return playersList;
        }





        //UPDATE FEATURES




       /* // Getting contacts Count
        public int getPlayerCount() {
            return 0;
        }
        // Updating single contact
        public int updatePOlayer(PlayersConnector playersConnector) {return 0;}

        // Deleting single contact
        public void deleteplayer(PlayersConnector playersConnector) {}
*/


}


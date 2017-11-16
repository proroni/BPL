package com.bpl_t.joy.root.bpl.Database;

/**
 * Created by root on 10/14/17.
 */

public class TeamConnector {



        String teamName;
        String about;
        int teamPhotoId;


        // Empty constructor
        public TeamConnector(){

        }
        // constructor
        public TeamConnector( String teamName,int teamPhotoId, String about){
            this.teamPhotoId = teamPhotoId;
            this.teamName = teamName;
            this.about = about;
        }


        // getting ID
        public int getTeamPhotoId(){
            return this.teamPhotoId;
        }

        // setting id
        public void setTeamPhotoId(int teamPhotoId){
            this.teamPhotoId = teamPhotoId;
        }

        // getting name
        public String getTeamName(){
            return this.teamName;
        }

        // setting name
        public void setTeamName(String teamName){
            this.teamName = teamName;
        }


        public String getAbout() {
            return this.about;
        }


        public void setAbout(String about){
            this.about = about;
        }
    }



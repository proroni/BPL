package com.bpl_t.joy.root.bpl.Database;

/**
 * Created by root on 10/14/17.
 */

public class PlayersConnector {
        int playerkey_id;
        String playerName;
        String playerAbout;
        String carrier;
        String teamName;
        String playerCountry;
        int playerPhotoId;



        public PlayersConnector(){}

        public PlayersConnector( int playerkey_id,String playerName, String about,String carrier,String country,String teamName,int playerPhotoId){
            this.playerkey_id=playerkey_id;
            this.playerName = playerName;
            this.playerAbout = about;
            this.carrier=carrier;
            this.playerCountry=country;
            this.teamName=teamName;
            this.playerPhotoId = playerPhotoId;
        }


        public int getid(){return this.playerkey_id;}

        public void setid(int playerkey_id){
            this.playerkey_id=playerkey_id;
        }

        public int getplayerPhotoId(){
            return this.playerPhotoId;
        }

        public void setplayerPhotoId(int playerPhotoId){this.playerPhotoId = playerPhotoId;}


        public String getPlayerName(){
            return this.playerName;
        }


        public void setPlayerName(String playerName){
            this.playerName = playerName;
        }


        public String getPlayerAbout() {
            return this.playerAbout;
        }


        public void setPlayerAbout(String about){
            this.playerAbout = about;
        }


        public void setPlayerCarrier(String carrier){this.carrier=carrier;}


        public String getPlayerCarrier(){return this.carrier;}


        public void setPlayerCountry(String playerCountry){
            this.playerCountry=playerCountry;
         }


        public String getPlayerCountry(){
            return this.playerCountry;
        }


        public void setPlayerteam(String teamName){this.teamName=teamName;}


        public String getPlayerteam(){return this.teamName;}



}





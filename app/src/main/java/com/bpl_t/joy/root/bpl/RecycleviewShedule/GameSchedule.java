package com.bpl_t.joy.root.bpl.RecycleviewShedule;

/**
 * Created by root on 10/28/17.
 */

public class GameSchedule {
    String gameNo;
    String gameDetails;
    String gameTime;
    String gameDate;


    public GameSchedule(String gameNo,String gameDate,String gameTime,String gameDetails) {
        this.gameNo=gameNo;
        this.gameDate=gameDate;
        this.gameDetails=gameDetails;
        this.gameTime=gameTime;
    }

    public String getGameDetails() {
        return gameDetails;
    }

    public void setGameDetails(String gameDetails) {
        this.gameDetails = gameDetails;
    }

    public String getGameTime() {
        return gameTime;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public String getGameDate() {
        return gameDate;
    }

    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }
    public String getGameNo() {
        return gameNo;
    }

    public void setGameNo(String gameNo) {
        this.gameNo = gameNo;
    }







}

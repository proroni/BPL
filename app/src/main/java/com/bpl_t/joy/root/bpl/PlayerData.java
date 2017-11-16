package com.bpl_t.joy.root.bpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/8/17.
 */

public class PlayerData {

    public String name;
    public String age;
    public int photoId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public PlayerData() {

    }

    public PlayerData(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }


  /*  private List<PlayerData> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new PlayerData("Emma Wilson", "23 years old", R.drawable.bpl_logo));
        persons.add(new PlayerData("Lavery Maiss", "25 years old", R.drawable.bpl_logo));
        persons.add(new PlayerData("Lillie Watts", "35 years old", R.drawable.bpl_logo));
    }*/
}




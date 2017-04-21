package com.example.tarikul.androidlistviewexample;

/**
 * Created by interspeed.com.bd on 27-Oct-16.
 */
public class RowItem {

    int profilePics;
    String description;

    public RowItem(int profilePics, String description) {
        this.profilePics = profilePics;
        this.description = description;
    }


    public int getProfilePics() {
        return profilePics;
    }

    public void setProfilePics(int profilePics) {
        this.profilePics = profilePics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

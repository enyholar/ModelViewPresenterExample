package com.gideondev.mvpsimpleexample.model;

/**
 * Created by ${ENNY} on 9/19/2017.
 */

public class NameModel {
    private String mName;
    private String mCountry;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public NameModel(String mName, String mCountry) {
        this.mName = mName;
        this.mCountry = mCountry;
    }
}

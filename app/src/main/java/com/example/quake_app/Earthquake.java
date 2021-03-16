package com.example.quake_app;

public class Earthquake {

    private final double mMagnitude;
    private final String mLocation;
    private final long mTimeInMilliseconds;
    private final String murl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        murl = url;
    }

    public double getMagnitude() {

        return mMagnitude;
    }

    public String getLocation() {

        return mLocation;
    }

    public long getTimeInMilliseconds() {

        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return murl;
    }

}

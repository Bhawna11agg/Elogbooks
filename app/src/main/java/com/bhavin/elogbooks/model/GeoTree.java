
package com.bhavin.elogbooks.model;

import com.google.gson.annotations.SerializedName;


public class GeoTree {

    @SerializedName("geofence")
    private Geofence mGeofence;

    public Geofence getGeofence() {
        return mGeofence;
    }

    public void setGeofence(Geofence geofence) {
        mGeofence = geofence;
    }

}

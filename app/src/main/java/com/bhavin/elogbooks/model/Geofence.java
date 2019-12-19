
package com.bhavin.elogbooks.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Geofence {

    @SerializedName("sets")
    private List<Set> mSets;

    public List<Set> getSets() {
        return mSets;
    }

    public void setSets(List<Set> sets) {
        mSets = sets;
    }

}

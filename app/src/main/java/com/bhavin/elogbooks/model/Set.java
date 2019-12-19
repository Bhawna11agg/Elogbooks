
package com.bhavin.elogbooks.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Set {

    @SerializedName("center")
    private Center mCenter;
    @SerializedName("regions")
    private List<Region> mRegions;

    public Center getCenter() {
        return mCenter;
    }

    public void setCenter(Center center) {
        mCenter = center;
    }

    public List<Region> getRegions() {
        return mRegions;
    }

    public void setRegions(List<Region> regions) {
        mRegions = regions;
    }

}

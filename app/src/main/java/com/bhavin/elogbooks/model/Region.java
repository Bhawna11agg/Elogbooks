
package com.bhavin.elogbooks.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Region {

    @SerializedName("center")
    private Center mCenter;
    @SerializedName("gf")
    private List<Gf> mGf;

    public Center getCenter() {
        return mCenter;
    }

    public void setCenter(Center center) {
        mCenter = center;
    }

    public List<Gf> getGf() {
        return mGf;
    }

    public void setGf(List<Gf> gf) {
        mGf = gf;
    }

}

package com.example.test4;

import com.google.gson.annotations.SerializedName;

public class Post {

    private String bsnsSector;
    private String bsnsCond;
    private String bsnsNm;
    @SerializedName("body")
    private String addrRoad;
    private String addrJibun;
    private String menu;
    private int tel;

    public String getBsnsSector() {
        return bsnsSector;
    }

    public String getBsnsCond() {
        return bsnsCond;
    }

    public String getBsnsNm() {
        return bsnsNm;
    }

    public String getAddrRoad() {
        return addrRoad;
    }

    public String getAddrJibun() {
        return addrJibun;
    }

    public String getMenu() {
        return menu;
    }

    public int getTel() {
        return tel;
    }
}

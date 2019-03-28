package com.kuro.daksh.locationservicenotificationdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JustAModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

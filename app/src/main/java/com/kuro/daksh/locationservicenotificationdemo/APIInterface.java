package com.kuro.daksh.locationservicenotificationdemo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import static com.kuro.daksh.locationservicenotificationdemo.App.URL_TRACK_TECH;

public interface APIInterface {

    @FormUrlEncoded
    @POST(URL_TRACK_TECH)
    Call<JustAModel> sendTechLoc(@Field("id") String id, @Field("latitude") String latitude, @Field("longitude") String longitude);


}

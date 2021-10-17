package com.example.lifepurse.repository;

import com.example.lifepurse.model.PurseJson;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Purse {
    @GET(value = "ShopCategories?Index=0&LangId=1&Ver=2.0")
    Call<PurseJson> getPurse(@Header("Authorization") String authHeader);

}

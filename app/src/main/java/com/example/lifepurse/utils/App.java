package com.example.lifepurse.utils;

import android.app.Application;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.lifepurse.repository.Purse;

public class App  extends Application {
    public Purse purse;
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

    public void initRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://life.megafon.tj:3344/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        purse = retrofit.create(Purse.class);
    }
}

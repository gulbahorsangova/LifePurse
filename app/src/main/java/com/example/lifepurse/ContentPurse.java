package com.example.lifepurse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;

import com.example.lifepurse.model.PaymentServices;
import com.example.lifepurse.model.PurseJson;
import com.example.lifepurse.utils.App;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;

import java.util.ArrayList;

public class ContentPurse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_purse);

        final ArrayList<PaymentServices> paymentServices = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.page_1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(ContentPurse.this));


        Call<PurseJson> purseJsonCall = App.getInstance().purse.getPurse("Basic OTkyMDA5MTExMTQ2OkFfOTkyMDA5MTExMTQ2X1NNLUE1MTVGX3NhbXN1bmdfMDVfMTNfMjA=");

        purseJsonCall.enqueue(new )
    }
}
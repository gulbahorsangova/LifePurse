package com.example.lifepurse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifepurse.model.PaymentServices;
import com.example.lifepurse.model.PurseJson;
import com.example.lifepurse.utils.App;

import java.util.ArrayList;

import retrofit2.Call;

public class ContentPurse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_purse);

        final ArrayList<PaymentServices> paymentServices = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.page_1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(ContentPurse.this));

        Call<PurseJson> purseJsonCall = App.getInstance()
                .purse.getPurse("Basic OTkyMDA5MTExMTQ2OkFfOTkyMDA5MTExMTQ2X1NNLUE1MTVGX3NhbXN1bmdfMDVfMTNfMjA=");
    }
}
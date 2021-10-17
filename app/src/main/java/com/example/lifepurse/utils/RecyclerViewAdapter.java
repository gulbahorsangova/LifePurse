package com.example.lifepurse.utils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.lifepurse.R;
import com.example.lifepurse.model.PaymentServices;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private final ArrayList<PaymentServices> arrayPaymentServices;
    private final Context context;

    public RecyclerViewAdapter(ArrayList<PaymentServices> arrayPaymentServices, Context context) {
        this.arrayPaymentServices = arrayPaymentServices;
        this.context = context;
    }


    @Override
    public RecyclerViewViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false);
                return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecyclerViewViewHolder holder, int position) {
        PaymentServices paymentServices = arrayPaymentServices.get(position);
        holder.text1.setText(paymentServices.getName());
        Log.d("field", paymentServices.getName());

    }

    @Override
    public int getItemCount() {
        return arrayPaymentServices.size();
    }

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{
        private final TextView text1;

        public RecyclerViewViewHolder( View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.page_1);
        }
    }
}

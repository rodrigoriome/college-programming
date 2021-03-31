package com.ibmr.shopping.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibmr.shopping.R;
import com.ibmr.shopping.models.Product;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Product> products;

    public RecyclerViewAdapter(List<Product> list) {
        this.products = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recyclerview_adapter_item, parent, false);

        return new RecyclerViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Product product = products.get(position);
        holder.productImage.setImageResource(product.getImage());
        holder.productName.setText(product.getName());
        holder.productQty.setText("QTD: " + Integer.toString(product.getQty()));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}

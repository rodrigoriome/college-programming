package com.ibmr.shopping.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibmr.shopping.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    ImageView productImage;
    TextView productName, productQty;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        productImage = itemView.findViewById(R.id.product_image);
        productName = itemView.findViewById(R.id.product_name);
        productQty = itemView.findViewById(R.id.product_qty);
    }
}

package com.ibmr.appreceitas.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibmr.appreceitas.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    ImageView recipeImage;
    TextView recipeName;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        recipeImage = itemView.findViewById(R.id.recipe_image);
        recipeName = itemView.findViewById(R.id.recipe_name);
    }
}

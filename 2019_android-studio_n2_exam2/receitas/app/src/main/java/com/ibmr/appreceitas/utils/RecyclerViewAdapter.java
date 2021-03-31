package com.ibmr.appreceitas.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibmr.appreceitas.R;
import com.ibmr.appreceitas.models.Recipe;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Recipe> recipes;

    public RecyclerViewAdapter(List<Recipe> list) {
        this.recipes = list;
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
        Recipe recipe = recipes.get(position);
        holder.recipeImage.setImageResource(recipe.getImage());
        holder.recipeName.setText(recipe.getName());
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }
}

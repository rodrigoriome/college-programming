package com.ibmr.baseapp.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibmr.baseapp.R;
import com.ibmr.baseapp.models.Discipline;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Discipline> disciplines;

    public RecyclerViewAdapter(List<Discipline> list) {
        this.disciplines = list;
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
        Discipline d = disciplines.get(position);
        holder.disciplineName.setText(d.getName());
        holder.disciplineProfessor.setText(d.getProfessor());
        holder.disciplineDayOfWeek.setText(d.getDayOfWeek());
        holder.disciplineRoom.setText(d.getRoom());
    }

    @Override
    public int getItemCount() {
        return disciplines.size();
    }
}

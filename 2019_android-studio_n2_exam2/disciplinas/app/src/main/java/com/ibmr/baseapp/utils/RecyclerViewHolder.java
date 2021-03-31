package com.ibmr.baseapp.utils;

        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.ibmr.baseapp.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    ImageView disciplineImage;
    TextView disciplineName, disciplineProfessor, disciplineDayOfWeek, disciplineRoom;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        disciplineImage = itemView.findViewById(R.id.discipline_image);
        disciplineName = itemView.findViewById(R.id.discipline_name);
        disciplineProfessor = itemView.findViewById(R.id.discipline_professor);
        disciplineDayOfWeek = itemView.findViewById(R.id.discipline_day_of_week);
        disciplineRoom = itemView.findViewById(R.id.discipline_room);
    }
}

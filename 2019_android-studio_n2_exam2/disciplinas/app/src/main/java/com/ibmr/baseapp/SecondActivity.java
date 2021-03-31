package com.ibmr.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView disciplineImage = findViewById(R.id.discipline_image);
        TextView disciplineName = findViewById(R.id.discipline_name);
        TextView disciplineInfo = findViewById(R.id.discipline_info);

        Bundle data = getIntent().getExtras();

        String info = data.getString("disciplineProfessor")
                + " - "
                + data.getString("disciplineDayOfWeek")
                + "@"
                + data.getString("disciplineRoom");

        disciplineImage.setImageResource(data.getInt("disciplineImage"));
        disciplineName.setText(data.getString("disciplineName"));
        disciplineInfo.setText(info);
    }
}

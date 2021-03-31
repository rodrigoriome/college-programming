package com.rodrigoriome.trip_fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle data = getIntent().getExtras();

        double distance = data.getDouble("distance");
        double consumption = data.getDouble("consumption");
        double total = distance / consumption;


        resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(String.format("%.2f", total) + " Litros");
    }
}

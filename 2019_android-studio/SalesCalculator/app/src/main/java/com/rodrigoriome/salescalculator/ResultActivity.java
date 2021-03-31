package com.rodrigoriome.salescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultLabel = findViewById(R.id.resultLabel);

        Bundle data = getIntent().getExtras();

        String finalPrice = data.getString("finalPrice");

        resultLabel.setText(finalPrice);
    }
}

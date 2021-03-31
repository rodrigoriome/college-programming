package com.rodrigoriome.imc_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView weightField, heightField;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightField = findViewById(R.id.weightField);
        heightField = findViewById(R.id.heightField);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(weightField.getText().toString());
                double height = Double.parseDouble(heightField.getText().toString());

                Intent resultView = new Intent(getApplicationContext(), ResultActivity.class);
                resultView.putExtra("userWeight", weight);
                resultView.putExtra("userHeight", height);

                startActivity(resultView);
            }
        });
    }
}

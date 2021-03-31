package com.rodrigoriome.trip_fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText distanceInput, consumptionInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distanceInput = findViewById(R.id.distanceInput);
        consumptionInput = findViewById(R.id.consumptionInput);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double distance = Double.parseDouble(distanceInput.getText().toString());
                double consumption = Double.parseDouble(consumptionInput.getText().toString());

                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                intent.putExtra("distance", distance);
                intent.putExtra("consumption", consumption);

                startActivity(intent);
            }
        });
    }
}

package com.rodrigoriome.salescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText priceInput, profitInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceInput = findViewById(R.id.priceInput);
        profitInput = findViewById(R.id.profitInput);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                double price = Double.parseDouble(priceInput.getText().toString());
                double profit = Double.parseDouble(profitInput.getText().toString());
                String finalPrice = String.format("%.2f", price * (1 + (profit / 100)));

                intent.putExtra("finalPrice", finalPrice);

                startActivity(intent);
            }
        });

    }
}

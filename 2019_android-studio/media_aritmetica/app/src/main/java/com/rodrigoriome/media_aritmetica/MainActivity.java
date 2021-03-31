package com.rodrigoriome.media_aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userInput1, userInput2, userInput3;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput1 = findViewById(R.id.userInput1);
        userInput2 = findViewById(R.id.userInput2);
        userInput3 = findViewById(R.id.userInput3);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(userInput1.getText().toString());
                double num2 = Double.parseDouble(userInput2.getText().toString());
                double num3 = Double.parseDouble(userInput3.getText().toString());

                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("num1", num1);
                intent.putExtra("num2", num2);
                intent.putExtra("num3", num3);

                startActivity(intent);
            }
        });
    }
}

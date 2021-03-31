package com.rodrigoriome.media_aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultTitle, resultMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTitle = findViewById(R.id.resultTitle);
        resultMain = findViewById(R.id.resultMain);
        Bundle data = getIntent().getExtras();

        double num1 = data.getDouble("num1");
        double num2 = data.getDouble("num2");
        double num3 = data.getDouble("num3");
        double media = (num1 + num2 + num3) / 3;

        resultTitle.setText(String.format("A média aritmética de %s, %s e %s é:", num1, num2, num3));
        resultMain.setText(String.format("%.2f", media));
    }
}

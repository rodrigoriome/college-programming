package com.rodrigoriome.imc_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultText;

    private final double IMC_LEVEL_1_MIN_VALUE = 0;
    private final String IMC_LEVEL_1_DESC = "Baixo peso";

    private final double IMC_LEVEL_2_MIN_VALUE = 18.5;
    private final String IMC_LEVEL_2_DESC = "Peso normal";

    private final double IMC_LEVEL_3_MIN_VALUE = 25;
    private final String IMC_LEVEL_3_DESC = "Excesso de peso";

    private final double IMC_LEVEL_4_MIN_VALUE = 30;
    private final String IMC_LEVEL_4_DESC = "Obesidade nível 1";

    private final double IMC_LEVEL_5_MIN_VALUE = 35;
    private final String IMC_LEVEL_5_DESC = "Obesidade nível 2";

    private final double IMC_LEVEL_6_MIN_VALUE = 40;
    private final String IMC_LEVEL_6_DESC = "Obesidade nível 3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.resultText);

        Bundle data = getIntent().getExtras();
        double weight = data.getDouble("userWeight");
        double height = data.getDouble("userHeight") / 100;
        double imc = weight / (Math.pow(height, 2));

        String result = getResultString(imc);

        resultText.setText(result);
    }

    protected String getResultString(double imc) {
        String result;

        String formatedImc = String.format("%.2f", imc);

        if (imc >= IMC_LEVEL_6_MIN_VALUE) {
            result = formatedImc + ", " + IMC_LEVEL_6_DESC;
        } else if (imc >= IMC_LEVEL_5_MIN_VALUE && imc < IMC_LEVEL_6_MIN_VALUE) {
            result = formatedImc + ", " + IMC_LEVEL_5_DESC;
        } else if (imc >= IMC_LEVEL_4_MIN_VALUE && imc < IMC_LEVEL_5_MIN_VALUE) {
            result = formatedImc + ", " + IMC_LEVEL_4_DESC;
        } else if (imc >= IMC_LEVEL_3_MIN_VALUE && imc < IMC_LEVEL_4_MIN_VALUE) {
            result = formatedImc + ", " + IMC_LEVEL_3_DESC;
        } else if (imc >= IMC_LEVEL_2_MIN_VALUE && imc < IMC_LEVEL_3_MIN_VALUE) {
            result = formatedImc + ", " + IMC_LEVEL_2_DESC;
        } else {
            result = formatedImc + ", " + IMC_LEVEL_1_DESC;
        }

        return result;
    }
}

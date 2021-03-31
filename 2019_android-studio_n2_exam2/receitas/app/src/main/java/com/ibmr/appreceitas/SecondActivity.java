package com.ibmr.appreceitas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeName = findViewById(R.id.recipe_name);
        TextView recipeDescription = findViewById(R.id.recipe_description);

        Bundle data = getIntent().getExtras();

        recipeImage.setImageResource(data.getInt("recipeImage"));
        recipeName.setText(data.getString("recipeName"));
        recipeDescription.setText(data.getString("recipeDescription"));
    }
}

package com.ibmr.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibmr.shopping.models.Product;

public class SecondActivity extends AppCompatActivity {

    ImageView productImage;
    TextView productName;
    TextView productQty;
    Button sub, add;
    Intent intent, resultIntent;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        productImage = findViewById(R.id.product_image);
        productName = findViewById(R.id.product_name);
        productQty = findViewById(R.id.product_qty);
        sub = findViewById(R.id.button_sub);
        add = findViewById(R.id.button_add);

        intent = getIntent();
        product = (Product)intent.getSerializableExtra("product");

        resultIntent = new Intent();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.increaseQty();
                productQty.setText(Integer.toString(product.getQty()));

                resultIntent.putExtra("productQty", product.getQty());
                resultIntent.putExtra("position", intent.getExtras().getInt("position"));

                setResult(RESULT_OK, resultIntent);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.decreaseQty();
                productQty.setText(Integer.toString(product.getQty()));

                resultIntent.putExtra("productQty", product.getQty());
                resultIntent.putExtra("position", intent.getExtras().getInt("position"));

                setResult(RESULT_OK, resultIntent);
            }
        });

        productImage.setImageResource(product.getImage());
        productName.setText(product.getName());
        productQty.setText(Integer.toString(product.getQty()));
    }
}

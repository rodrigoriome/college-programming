package com.ibmr.shopping;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ibmr.shopping.models.Cart;
import com.ibmr.shopping.models.Product;
import com.ibmr.shopping.utils.RecyclerViewAdapter;
import com.ibmr.shopping.utils.RecyclerViewOnItemTouchListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> products = new ArrayList<Product>();
    RecyclerView recyclerView;
    TextView cartTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.insertData();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartTotal = findViewById(R.id.cart_total);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(products));

        cartTotal.setText(Cart.getTitle());

        recyclerView.addOnItemTouchListener(
            new RecyclerViewOnItemTouchListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerViewOnItemTouchListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                            intent.putExtra("product", products.get(position));
                            intent.putExtra("position", position);

                            startActivityForResult(intent, 1);
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {}

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {}
                    }
            )
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                products.get(data.getExtras().getInt("position")).setQty(data.getExtras().getInt("productQty"));
                recyclerView.setAdapter(new RecyclerViewAdapter(products));
                cartTotal.setText(Cart.getTitle());
            }
        }
    }

    public void insertData() {
        products.add(new Product("Cadeira Gamer", 0, R.drawable.cadeira));
        products.add(new Product("Placa de Vídeo AMD RX 590", 0, R.drawable.gpu));
        products.add(new Product("Processador AMD Ryzen 5 3600X", 0, R.drawable.cpu));
        products.add(new Product("Memória RAM 8GB HyperX", 0, R.drawable.mem));
        products.add(new Product("Fonte Corsair 750W Gold", 0, R.drawable.fonte));
        products.add(new Product("Gabinete Gamer CoolerMaster", 0, R.drawable.gabinete));
        products.add(new Product("Mouse Gamer Logitech", 0, R.drawable.mouse));
        products.add(new Product("Teclado Gamer Mecânico", 0, R.drawable.teclado));
    }
}

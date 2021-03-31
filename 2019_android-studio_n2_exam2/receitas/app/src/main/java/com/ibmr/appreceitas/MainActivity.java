package com.ibmr.appreceitas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.ibmr.appreceitas.models.Recipe;
import com.ibmr.appreceitas.utils.RecyclerViewAdapter;
import com.ibmr.appreceitas.utils.RecyclerViewOnItemTouchListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Recipe> recipes = new ArrayList<Recipe>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recycler_view);

        this.insertData();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(recipes));

        recyclerView.addOnItemTouchListener(
            new RecyclerViewOnItemTouchListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerViewOnItemTouchListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                            intent.putExtra("recipeImage", recipes.get(position).getImage());
                            intent.putExtra("recipeName", recipes.get(position).getName());
                            intent.putExtra("recipeDescription", recipes.get(position).getDescription());

                            startActivity(intent);
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {}

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {}
                    }
            )
        );
    }

    public void insertData() {
        recipes.add(new Recipe(
                "Fraldinha Assada na Cerveja",
                "Marinada na cerveja, a fraldinha sai do forno dourada, suculenta e macia. E ainda rende um molho saboroso. Atenção para a técnica de corte, que deixa as fatias da carne bem macias.",
                R.drawable.fraldinha
        ));

        recipes.add(new Recipe(
                "Rosbife",
                "Clássico é clássico! Com a técnica certa, o rosbife fica perfeito. Atente para os tempos e as temperaturas. Ele não pode estar gelado e precisa mesmo do descanso depois de assado.",
                R.drawable.rosbife
        ));

        recipes.add(new Recipe(
                "Lombo Assado com Tomates e Ervas",
                "Diga adeus ao lombo ressecado! Este fica úmido e perfumado. Os tomates assados, além de lindos, dão sabor ao molho feito com o líquido da assadeira. Receita para receber a família no fim de semana e boa candidata para o Natal!",
                R.drawable.lombo
        ));

        recipes.add(new Recipe(
                "Carne-seca Acebolada com Manteiga de Garrafa",
                "Comida bem brasileira, versátil e cheia de personalidade. Com vinagrete de feijão-fradinho e quibebe, a refeição está resolvida. Mas vai bem também com purê de banana, com arroz e feijão, com farofa…",
                R.drawable.carne_seca
        ));

        recipes.add(new Recipe(
                "Carne de Sol",
                "Apesar do nome, não precisa de sol para curar a carne. Precisa de sal, açúcar mascavo e tempo. A espera compensa: o resultado é um carne com sabor acentuado e textura macia. A receita é do chef Rodrigo Oliveira.",
                R.drawable.carne_de_sol
        ));

        recipes.add(new Recipe(
                "Bife à Milanesa com Salada de Batatas e Repolho Agridoce",
                "Combinação clássica, com ar vintage, jeitão tradicional… não importa o rótulo, bife à milanesa com salada de batatas é deliciosamente fácil de preparar e vai bem em muitas ocasiões.",
                R.drawable.bife_milanesa
        ));

        recipes.add(new Recipe(
                "Picadinho Oriental com Lombo e Abacaxi",
                "A receita é oriental, os sabores são bem brasileiros. E o encontro é surpreendente. Lombo e abacaxi combinam muito, isso tudo mundo sabe; e a couve entra, em quadradões, dando uma sacudida nesse picadinho. Uma dica: não cabule o pré-preparo dos ingredientes. O cozimento é bem rápido. Antes de começar, deixe tudo no jeito.",
                R.drawable.picadinho
        ));

        recipes.add(new Recipe(
                "Paçoca de Carne-Seca",
                "Na versão tradicional, a carne-seca é batida no pilão até formar uma paçoca. Na versão Panelinha, usamos o processador, para deixar mais prático. E para ficar mais saboroso, o refogado é com manteiga de garrafa.",
                R.drawable.pacoca
        ));

        recipes.add(new Recipe(
                "Escondidinho de Mandioca com Carne-Seca",
                "Clássico brasileiro, o escondidinho pode parecer trabalhoso mas compensa cada etapa do preparo (que pode ser distribuído em dias diferentes para facilitar). Ele rende que é uma beleza e funciona como prato único.",
                R.drawable.escondidinho
        ));
    }
}

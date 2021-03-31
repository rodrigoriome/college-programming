package com.ibmr.baseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.ibmr.baseapp.models.Discipline;
import com.ibmr.baseapp.utils.RecyclerViewAdapter;
import com.ibmr.baseapp.utils.RecyclerViewOnItemTouchListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Discipline> disciplines = new ArrayList<Discipline>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recycler_view);

        this.insertData();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(disciplines));

        recyclerView.addOnItemTouchListener(
            new RecyclerViewOnItemTouchListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerViewOnItemTouchListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                            intent.putExtra("disciplineImage", disciplines.get(position).getImage());
                            intent.putExtra("disciplineName", disciplines.get(position).getName());
                            intent.putExtra("disciplineProfessor", disciplines.get(position).getProfessor());
                            intent.putExtra("disciplineDayOfWeek", disciplines.get(position).getDayOfWeek());
                            intent.putExtra("disciplineRoom", disciplines.get(position).getRoom());

                            startActivity(intent);
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {

                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );
    }

    public void insertData() {
        disciplines.add(new Discipline("Lógica de Programação","Juan Baptista","SEG","LAB 05", R.drawable.logica));
        disciplines.add(new Discipline("Estatística Computacional","Wellington Avila","SEG","SALA 107", R.drawable.ec));
        disciplines.add(new Discipline("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109", R.drawable.sdi));
        disciplines.add(new Discipline("Banco de Dados I","Fabrício Curvello","QUA","LAB 05", R.drawable.bd1));
        disciplines.add(new Discipline("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05", R.drawable.arquitetura));
        disciplines.add(new Discipline("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04", R.drawable.poo));
        disciplines.add(new Discipline("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02", R.drawable.pdm));
        disciplines.add(new Discipline("Estrutura de Dados","Juan Baptista","QUI","LAB 04", R.drawable.estrutura));
        disciplines.add(new Discipline("Interface Humano-Computador","Wellington Avila","SEX","SALA 109", R.drawable.ihc));
        disciplines.add(new Discipline("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02", R.drawable.web));
    }
}

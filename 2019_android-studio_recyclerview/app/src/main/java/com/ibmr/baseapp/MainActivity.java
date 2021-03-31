package com.ibmr.baseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ibmr.baseapp.models.Discipline;
import com.ibmr.baseapp.utils.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Discipline> disciplines = new ArrayList<Discipline>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        this.insertData();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new RecyclerViewAdapter(disciplines));
    }

    public void insertData() {
        disciplines.add(new Discipline("Lógica de Programação","Juan Baptista","SEG","LAB 05" ));
        disciplines.add(new Discipline("Estatística Computacional","Wellington Avila","SEG","SALA 107" ));
        disciplines.add(new Discipline("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" ));
        disciplines.add(new Discipline("Banco de Dados I","Fabrício Curvello","QUA","LAB 05"));
        disciplines.add(new Discipline("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05"));
        disciplines.add(new Discipline("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04"));
        disciplines.add(new Discipline("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02"));
        disciplines.add(new Discipline("Estrutura de Dados","Juan Baptista","QUI","LAB 04"));
        disciplines.add(new Discipline("Interface Humano-Computador","Wellington Avila","SEX","SALA 109"));
        disciplines.add(new Discipline("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02"));
    }
}

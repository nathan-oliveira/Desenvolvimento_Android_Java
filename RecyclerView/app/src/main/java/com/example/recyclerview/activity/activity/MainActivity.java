package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Listagem de filmes
        this.criarFilmes();

        // Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        // Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void criarFilmes() {
        Filme filme = new Filme("titulo", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero1", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero2", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero3", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero4", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero5", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero6", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero7", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo8", "genero8", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo9", "genero9", "2020");
        this.listaFilmes.add(filme);
    }
}
package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Define layout
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerPostagem.setLayoutManager(layoutManager);

        // Define adapter
        prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {
        Postagem p = new Postagem("Nathan Olivera", "#tbt Viagem Legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Título 1", "Descrição 1", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Título 2", "Descrição 2", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Título 3", "Descrição 3", R.drawable.imagem4);
        this.postagens.add(p);
    }
}
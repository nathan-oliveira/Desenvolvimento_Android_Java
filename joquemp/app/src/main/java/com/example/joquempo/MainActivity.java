package com.example.joquempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario) {
        ImageView imgResult = findViewById(R.id.imgResult);
        TextView textResult = findViewById(R.id.textResult);

        int num = new Random().nextInt(3);
        String[] joquempo = {"Pedra", "Papel", "Tesoura"};
        String escolhaApp = joquempo[num];

        switch (escolhaApp) {
            case "Pedra":
                imgResult.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imgResult.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imgResult.setImageResource(R.drawable.tesoura);
                break;
            default:
                imgResult.setImageResource(R.drawable.padrao);
        }

        if(
            (escolhaApp == "Tesoura" && escolhaUsuario == "Papel") ||
            (escolhaApp == "Papel" && escolhaUsuario == "Pedra") ||
            (escolhaApp == "Pedra" && escolhaUsuario == "Tesoura")
        ) { // App ganhador
            textResult.setText("Você perdeu :(");
        } else if(
            (escolhaUsuario == "Tesoura" && escolhaApp == "Papel") ||
            (escolhaUsuario == "Papel" && escolhaApp == "Pedra") ||
            (escolhaUsuario == "Pedra" && escolhaApp == "Tesoura")
        ) { // Usuario ganhador
            textResult.setText("Você ganhou :)");
        } else { // Empate
            textResult.setText("Empatamos ;)");
        }
    }
}
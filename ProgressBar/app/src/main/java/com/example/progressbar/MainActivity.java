package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircular;
    private int progresso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarCircular = findViewById(R.id.progressBarCircular);

        progressBarCircular.setVisibility(View.GONE);
    }

    public  void carregarProgressBar(View view) {
        // ProgressBar Horizontal
        this.progresso = this.progresso + 1;
        progressBarHorizontal.setProgress(this.progresso);

        // ProgressBar Circular
        progressBarCircular.setVisibility(View.VISIBLE);

        if(this.progresso == 10) {
            progressBarCircular.setVisibility(View.GONE);
        }
    }
}
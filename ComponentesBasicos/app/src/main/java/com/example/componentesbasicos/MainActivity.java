package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton sexoM, sexoF;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResult);

        //CheckBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoM = findViewById(R.id.radioButtonM);
        sexoF = findViewById(R.id.radioButtonF);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radiobutton();
    }

    public void radiobutton() {
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.radioButtonM) {
                    textoResultado.setText("Masculino");
                } else if(checkedId == R.id.radioButtonF) {
                    textoResultado.setText("Feminino");
                }
            }
        });
//        if(sexoM.isChecked()) {
//            textoResultado.setText("Masculino");
//        } else if(sexoF.isChecked()) {
//            textoResultado.setText("Feminino");
//        }
    }

    public void enviar(View view) {
//        radiobutton();
//        checkbox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("Resultado: Nome: "+nome+" Email: "+email);
         */
    }

    public void checkbox() {
        String texto = "";

        if(checkVerde.isChecked()) {
            String corSelecionada = checkVerde.getText().toString();
            texto += corSelecionada + " , ";
        }

        if(checkBranco.isChecked()) {
            String corSelecionada = checkBranco.getText().toString();
            texto += corSelecionada + " , ";
        }

        if(checkVermelho.isChecked()) {
            String corSelecionada = checkVermelho.getText().toString();
            texto += corSelecionada + " , ";
        }

        textoResultado.setText(texto);
    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
        checkVerde.setChecked(false);
        checkBranco.setChecked(false);
        checkVermelho.setChecked(false);
        sexoM.setChecked(false);
        sexoF.setChecked(false);
        textoResultado.setText("Resultado: ");
    }
}
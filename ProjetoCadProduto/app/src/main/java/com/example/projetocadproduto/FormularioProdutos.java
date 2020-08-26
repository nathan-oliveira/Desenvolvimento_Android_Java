package com.example.projetocadproduto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.projetocadproduto.BDHelper.ProdutosBd;
import com.example.projetocadproduto.model.Produtos;

public class FormularioProdutos extends AppCompatActivity {

    EditText editText_NomeProduto, editText_DescricaoProduto, editText_QuantidadeProduto;
    Button btn_SalvarProduto;
    Produtos editarProduto, produto;
    ProdutosBd bdHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_produtos);

        produto = new Produtos();
        bdHelper = new ProdutosBd(FormularioProdutos.this);

        Intent intent = getIntent();
        editarProduto = (Produtos) intent.getSerializableExtra("produto-escolhido");

        editText_NomeProduto = (EditText) findViewById(R.id.editText_NomeProduto);
        editText_DescricaoProduto = (EditText) findViewById(R.id.editText_NomeProduto);
        editText_QuantidadeProduto = (EditText) findViewById(R.id.editText_QuantidadeProduto);

        btn_SalvarProduto = (Button) findViewById(R.id.btn_SalvarProduto);

        if(editarProduto != null) {
            btn_SalvarProduto.setText("Alterar");

            editText_NomeProduto.setText(editarProduto.getNomeProduto());
            editText_DescricaoProduto.setText(editarProduto.getDescricao());
            editText_QuantidadeProduto.setText(editarProduto.getQuantidade()+"");

            produto.setId(editarProduto.getId());
        } else {
            btn_SalvarProduto.setText("Cadastrar");
        }

        btn_SalvarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                produto.setNomeProduto(editText_NomeProduto.getText().toString());
                produto.setDescricao(editText_DescricaoProduto.getText().toString());
                produto.setQuantidade(Integer.parseInt(editText_QuantidadeProduto.getText().toString()));

                if(btn_SalvarProduto.getText().toString().equals("Cadastrar")) {
                    bdHelper.salvarProduto(produto);
                    bdHelper.close();
                } else {
                    bdHelper.alterarProduto(produto);
                    bdHelper.close();
                }

                finish();
            }
        });
    }
}
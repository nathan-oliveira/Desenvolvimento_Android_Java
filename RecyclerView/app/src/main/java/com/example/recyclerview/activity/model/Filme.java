package com.example.recyclerview.activity.model;

/*
 * Created by Nathan Oliveira
 */
public class Filme {
    private String tituloFilme;
    private String gereno;
    private String ano;

    public Filme(String tituloFilme, String gereno, String ano) {
        this.tituloFilme = tituloFilme;
        this.gereno = gereno;
        this.ano = ano;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGereno() {
        return gereno;
    }

    public void setGereno(String gereno) {
        this.gereno = gereno;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

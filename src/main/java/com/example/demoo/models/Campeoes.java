package com.example.demoo.models;

public class Campeoes {
    private String clube;
    private int ano;
    private String reiDaAmerica;

    public Campeoes(String clube, int ano, String reiDaAmerica){
        this.clube=clube;
        this.ano=ano;
        this.reiDaAmerica=reiDaAmerica;
    }
    public String getClube() {
        return clube;
    }

    public int getAno() {
        return ano;
    }

    public String getReiDaAmerica() {
        return reiDaAmerica;
    }


    public void setClube(String clube) {
        this.clube = clube;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setReiDaAmerica(String reiDaAmerica) {
        this.reiDaAmerica = reiDaAmerica;
    }
}

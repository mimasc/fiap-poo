package br.com.fiapride.model;

public class ArCondicionado {
    public String marca;
    public String cor;
    public int potenciaBTU;
    public int temperaturaDesejada;
    public boolean ligado;

    public void ligarDesligar(boolean valor) {
        this.ligado = valor;
        if (this.ligado == true) {
            System.out.println("O ar " + marca + " agora está LIGADO.");
        } else {
            System.out.println("O ar " + marca + " agora está DESLIGADO.");
        }
    }

    public void setTemperatura(int novaTemperatura) {
        this.temperaturaDesejada = novaTemperatura;
        System.out.println("Temperatura alterada para: " + temperaturaDesejada + "°C");
    }
}

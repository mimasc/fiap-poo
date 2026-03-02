package br.com.fiapride.model;

public class ArCondicionado {
    private String marca;
    private String cor;
    private int potenciaBTU;
    private int temperaturaDesejada;
    private boolean ligado;

    // Método simples para ligar/desligar com true ou false
    public void LigarDesligar(boolean status) {
        this.ligado = status;
        if (this.ligado) {
            System.out.println("Ar-condicionado LIGADO.");
        } else {
            System.out.println("Ar-condicionado DESLIGADO.");
        }
    }

    // Operação: adicionarTemperatura (Sobe 1 grau)
    public void adicionarTemperatura() {
        if (ligado) {
            this.temperaturaDesejada++; // Aumenta em 1
            System.out.println("Temperatura aumentada para: " + temperaturaDesejada + "°C");
        } else {
            System.out.println("Ligue o aparelho primeiro para mudar a temperatura!");
        }
    }

    // Operação: diminuirTemperatura (Desce 1 grau)
    public void diminuirTemperatura() {
        if (ligado) {
            this.temperaturaDesejada--; // Diminui em 1
            System.out.println("Temperatura diminuída para: " + temperaturaDesejada + "°C");
        } else {
            System.out.println("Ligue o aparelho primeiro para mudar a temperatura!");
        }
    }
}

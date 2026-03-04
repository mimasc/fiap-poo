package br.com.fiapride.model;

public class ArCondicionado {
    // Atributos privados (a "barragem")
    private String marca;
    private String cor;
    private int potenciaBTU;
    private int temperaturaDesejada;
    private boolean ligado;

    // --- MÉTODOS GETTERS E SETTERS ---
    
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getPotenciaBTU() { return potenciaBTU; }
    public void setPotencia(int potenciaBTU) { this.potenciaBTU = potenciaBTU; }

    public int getTemperatura() { return temperaturaDesejada; }
    // O setTemperatura é privado ou controlado no seu diagrama para segurança
    public void setTemperatura(int temperaturaDesejada) { this.temperaturaDesejada = temperaturaDesejada; }

    public boolean getLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }

    // --- OPERAÇÕES DE NEGÓCIO ---

    public void LigarDesligar(boolean status) {
        this.ligado = status;
        System.out.println(this.ligado ? "Ar-condicionado LIGADO." : "Ar-condicionado DESLIGADO.");
    }

    public void adicionarTemperatura() {
        if (ligado) {
            this.temperaturaDesejada++;
            System.out.println("Temperatura aumentada para: " + temperaturaDesejada + "°C");
        } else {
            System.out.println("Ligue o aparelho primeiro!");
        }
    }

    public void diminuirTemperatura() {
        if (ligado) {
            this.temperaturaDesejada--;
            System.out.println("Temperatura diminuída para: " + temperaturaDesejada + "°C");
        } else {
            System.out.println("Ligue o aparelho primeiro!");
        }
    }
}


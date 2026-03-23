//package br.com.fiapride.model;
//
//public class ArCondicionado {
//    // Atributos privados
//    private String marca;
//    private String cor;
//    private int potenciaBTU;
//    private int temperaturaDesejada;
//    private boolean ligado;
//
//    // CONSTRUTOR 
//    // Atributo essencial escolhido: marca
//    public ArCondicionado(String marca) {
//        this.setMarca(marca);
//    }
//
//    // GETTERS E SETTERS 
//    
//    public String getMarca() { return marca; }
//    public void setMarca(String marca) { this.marca = marca; }
//
//    public String getCor() { return cor; }
//    public void setCor(String cor) { this.cor = cor; }
//
//    public int getPotenciaBTU() { return potenciaBTU; }
//    public void setPotencia(int potenciaBTU) { this.potenciaBTU = potenciaBTU; }
//
//    public int getTemperatura() { return temperaturaDesejada; }
//    public void setTemperatura(int temperaturaDesejada) { this.temperaturaDesejada = temperaturaDesejada; }
//
//    public boolean getLigado() { return ligado; }
//    public void setLigado(boolean ligado) { this.ligado = ligado; }
//
//    public void LigarDesligar(boolean status) {
//        this.ligado = status;
//        System.out.println(this.ligado ? "Ar-condicionado LIGADO." : "Ar-condicionado DESLIGADO.");
//    }
//
//    public void adicionarTemperatura() {
//        if (ligado) {
//            this.temperaturaDesejada++;
//            System.out.println("Temperatura aumentada para: " + temperaturaDesejada + "°C");
//        } else {
//            System.out.println("Ligue o aparelho primeiro!");
//        }
//    }
//
//    public void diminuirTemperatura() {
//        if (ligado) {
//            this.temperaturaDesejada--;
//            System.out.println("Temperatura diminuída para: " + temperaturaDesejada + "°C");
//        } else {
//            System.out.println("Ligue o aparelho primeiro!");
//        }
//    }
//}

package br.com.fiapride.model;

public class ArCondicionado {
    private String marca;
    private String cor;
    private int potenciaBTU;
    private int temperaturaDesejada;
    private boolean ligado;
    private Filtro filtro; // Atributo para a associação

    public ArCondicionado(String marca, Filtro filtro) {
        this.marca = marca;
        this.filtro = filtro;
    }

    // Getter para o filtro 
    public Filtro getFiltro() { return filtro; }

    public void LigarDesligar() {
        this.ligado = !this.ligado;
        System.out.println(ligado ? "Ligado" : "Desligado");
    }

    public void adicionarTemperatura() {
        if (ligado) {
            this.temperaturaDesejada++;
            // Aumenta um pouco a sujeira do filtro associado
            double atual = filtro.getNivelSujeira();
            filtro.setNivelSujeira(atual + 0.5);
        }
    }
}

package br.com.fiapride.model;

public class Filtro {
    private String tipo;
    private double nivelSujeira; // Nome exato do diagrama
    private String dataTroca;

    public Filtro(String tipo) {
        this.tipo = tipo;
        this.nivelSujeira = 0.0;
    }

    // Métodos do diagrama
    public void limparFiltro() {
        this.nivelSujeira = 0.0;
        System.out.println("Filtro limpo com sucesso!");
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getNivelSujeira() { return nivelSujeira; }
    public void setNivelSujeira(double nivelSujeira) { this.nivelSujeira = nivelSujeira; }
}

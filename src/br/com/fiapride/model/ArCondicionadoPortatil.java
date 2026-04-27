package br.com.fiapride.model;

public class ArCondicionadoPortatil extends ArCondicionado {
    
    private double capacidadeReservatorio;
    private double volumeAguaAtual;

    // Construtor:
    public ArCondicionadoPortatil(String marca, Filtro filtro, double capacidade) {
        super(marca, filtro); 
        this.capacidadeReservatorio = capacidade;
        this.volumeAguaAtual = 0.0; 
    }

    // Método que SÓ o portátil tem
    public void esvaziarReservatorio() {
        this.volumeAguaAtual = 0.0;
        System.out.println("Reservatório do portátil esvaziado!");
    }

    // Getters e Setters exclusivos do portátil
    public double getCapacidadeReservatorio() { return capacidadeReservatorio; }
    public void setCapacidadeReservatorio(double capacidade) { this.capacidadeReservatorio = capacidade; }

    public double getVolumeAguaAtual() { return volumeAguaAtual; }
    public void setVolumeAguaAtual(double volume) { this.volumeAguaAtual = volume; }
}

// Polimorfismo
@Override
public void exibirStatus() {
    super.exibirStatus(); // Chama o básico do pai
    System.out.println("Tipo: Portátil");
    System.out.println("Reservatório: " + volumeAguaAtual + "L / " + capacidadeReservatorio + "L");
}
@Override
public void modoEconomia() {
    System.out.println("Modo Econômico Portátil: Reduzindo rotação do compressor e luzes do painel.");
}

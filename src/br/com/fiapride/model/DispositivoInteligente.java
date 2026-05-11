package br.com.fiapride.model;

public interface DispositivoInteligente {
    // Um "contrato" que obriga a implementar a conexão
    void conectarWifi();
    void exibirConsumoEnergia();
}

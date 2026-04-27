// Nova classe filha para Polimorfismo
package br.com.fiapride.model;

public class ArCondicionadoInverter extends ArCondicionado {
    public ArCondicionadoInverter(String marca, double btu) {
        super(marca, btu);
    }

    @Override
    public void exibirRelatorio() {
        super.exibirRelatorio();
        System.out.println("Tipo: Inverter - Status: Economizando 40% de energia.");
    }
    @Override
public void modoEconomia() {
    System.out.println("Modo Econômico Inverter: Ajustando frequência Hertz para manter a temperatura com gasto mínimo.");
}
}

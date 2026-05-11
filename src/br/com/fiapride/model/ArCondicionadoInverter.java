// Nova classe filha para Polimorfismo
// package br.com.fiapride.model;

// public class ArCondicionadoInverter extends ArCondicionado {
//     public ArCondicionadoInverter(String marca, double btu) {
//         super(marca, btu);
//     }

//     @Override
//     public void exibirRelatorio() {
//         super.exibirRelatorio();
//         System.out.println("Tipo: Inverter - Status: Economizando 40% de energia.");
//     }
//     @Override
// public void modoEconomia() {
//     System.out.println("Modo Econômico Inverter: Ajustando frequência Hertz para manter a temperatura com gasto mínimo.");
// }
// }
package br.com.fiapride.model;

// Ele herda de ArCondicionado E implementa DispositivoInteligente
public class ArCondicionadoInverter extends ArCondicionado implements DispositivoInteligente {
    
    public ArCondicionadoInverter(String marca, Filtro filtro) {
        super(marca, filtro);
    }

    @Override
    public void modoEconomia() {
        System.out.println("Inverter: Otimizando frequência para economia máxima.");
    }

    // Obrigatório implementar os métodos da Interface
    @Override
    public void conectarWifi() {
        System.out.println("Conectando o ar " + marca + " ao app FiapRide via Wi-Fi...");
    }

    @Override
    public void exibirConsumoEnergia() {
        System.out.println("Consumo atual: 1.2 kWh");
    }
}

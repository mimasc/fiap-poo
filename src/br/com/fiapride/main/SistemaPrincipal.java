package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.ArCondicionado;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	// Dentro do main...// Fabriquei a primeira (Instância 1)
    	ArCondicionado ArCondicionadoCasa = new ArCondicionado();
    	ArCondicionadoCasa.cor = "Azul";
    	ArCondicionadoCasa.potenciaBTU = 120;
    	ArCondicionadoCasa.marca = "Eletrolux";
    	// Fabriquei a segunda (Instância 2)
    	ArCondicionado ArCondicionadoTrabalho = new ArCondicionado();
    	ArCondicionadoTrabalho.cor = "Branco";
    	ArCondicionadoTrabalho.ligado = true;
    	ArCondicionadoTrabalho.temperaturaDesejada = 23;
    	System.out.println("O Ar-condicionado de casa é: " + ArCondicionadoCasa.cor + ", tem potência: " + ArCondicionadoCasa.potenciaBTU + "W" + " e é da marca:" + ArCondicionadoCasa.marca);
    	System.out.println("O Ar-condicionado do trabalho é: " + ArCondicionadoTrabalho.cor + ". Ele está está ligado? " + ArCondicionadoTrabalho.ligado + ", e está na temperatura desejada de: " + ArCondicionadoTrabalho.temperaturaDesejada + "C");

    }
}
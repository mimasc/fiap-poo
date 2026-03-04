package br.com.fiapride.main;

//Importamos a classe AC para que o sistema a reconheça AULA 1
//aula 2
//import br.com.fiapride.model.ArCondicionado;
//
//public class SistemaPrincipal {
//
//public static void main(String[] args) {
//	// Dentro do main...// Fabriquei a primeira (Instância 1)
//	ArCondicionado ArCondicionadoCasa = new ArCondicionado();
//	ArCondicionadoCasa.cor = "Azul";
//	ArCondicionadoCasa.potenciaBTU = 120;
//	ArCondicionadoCasa.marca = "Eletrolux";
//	// Fabriquei a segunda (Instância 2)
//	ArCondicionado ArCondicionadoTrabalho = new ArCondicionado();
//	ArCondicionadoTrabalho.cor = "Branco";
//	ArCondicionadoTrabalho.ligado = true;
//	ArCondicionadoTrabalho.temperaturaDesejada = 23;
//	System.out.println("O Ar-condicionado de casa é: " + ArCondicionadoCasa.cor + ", tem potência: " + ArCondicionadoCasa.potenciaBTU + "W" + " e é da marca:" + ArCondicionadoCasa.marca);
//	System.out.println("O Ar-condicionado do trabalho é: " + ArCondicionadoTrabalho.cor + ". Ele está está ligado? " + ArCondicionadoTrabalho.ligado + ", e está na temperatura desejada de: " + ArCondicionadoTrabalho.temperaturaDesejada + "C");

// add novo código com barragem p n mudar só visualizar (encapsular)

import br.com.fiapride.model.ArCondicionado;

public class TesteArCondicionado {

    public static void main(String[] args) {
        // 1. Instanciando o objeto
        ArCondicionado meuAr = new ArCondicionado();
        
        // 2. Configurando os dados através dos SETTERS (Encapsulamento)
        meuAr.setMarca("Samsung");
        meuAr.setTemperatura(20); 
        
        // 3. Testando as operações do seu Astah
        meuAr.LigarDesligar(true);
        meuAr.adicionarTemperatura(); // Vai para 21
        
        // 4. Exibindo os resultados usando GETTERS
        System.out.println("--- Status do Ar ---");
        System.out.println("Marca: " + meuAr.getMarca());
        System.out.println("Temp Atual: " + meuAr.getTemperatura() + "°C");
        
        meuAr.LigarDesligar(false);
        // teste de erro meuAr.marca"LG";
        
    }
}

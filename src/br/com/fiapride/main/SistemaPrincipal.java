package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
//import br.com.fiapride.model.ArCondicionado;
//
//public class SistemaPrincipal {
//
//    public static void main(String[] args) {
//    	// Dentro do main...// Fabriquei a primeira (Instância 1)
//    	ArCondicionado ArCondicionadoCasa = new ArCondicionado();
//    	ArCondicionadoCasa.cor = "Azul";
//    	ArCondicionadoCasa.potenciaBTU = 120;
//    	ArCondicionadoCasa.marca = "Eletrolux";
//    	// Fabriquei a segunda (Instância 2)
//    	ArCondicionado ArCondicionadoTrabalho = new ArCondicionado();
//    	ArCondicionadoTrabalho.cor = "Branco";
//    	ArCondicionadoTrabalho.ligado = true;
//    	ArCondicionadoTrabalho.temperaturaDesejada = 23;
//    	System.out.println("O Ar-condicionado de casa é: " + ArCondicionadoCasa.cor + ", tem potência: " + ArCondicionadoCasa.potenciaBTU + "W" + " e é da marca:" + ArCondicionadoCasa.marca);
//    	System.out.println("O Ar-condicionado do trabalho é: " + ArCondicionadoTrabalho.cor + ". Ele está está ligado? " + ArCondicionadoTrabalho.ligado + ", e está na temperatura desejada de: " + ArCondicionadoTrabalho.temperaturaDesejada + "C");
//
//    }
//}
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);

    }
}
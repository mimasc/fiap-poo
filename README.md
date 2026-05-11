🚀 Jornada POO - FiapRide & FiapDelivery
Este repositório registra a evolução dos meus estudos em Programação Orientada a Objetos (POO). O projeto foi desenvolvido de forma incremental, partindo de conceitos básicos de classes até a implementação de arquiteturas robustas utilizando Abstração e Interfaces.

🧠 Reflexão de Aprendizado
1. Classes, Atributos e o "Nascimento" (Construtores)
O ponto de partida foi entender que uma classe é um molde. Aprendi que objetos não devem "nascer" incompletos, por isso implementei Construtores que exigem parâmetros obrigatórios (como a marca do ar-condicionado ou a placa de um veículo), garantindo a integridade dos dados desde o primeiro segundo de execução.

2. Encapsulamento: A Segurança dos Dados
Aprendi que deixar atributos como public é um risco de segurança (o "crime do estagiário"). Refatorei o código para usar modificadores private, protegendo os dados e permitindo o acesso apenas através de métodos Getters e Setters, onde incluí regras de validação (ex: impedir que o peso de um pacote ou a capacidade de um veículo sejam negativos).

3. Associação e Composição
Entendi que nem tudo é Herança. No projeto do Ar-condicionado, apliquei a Associação com a classe Filtro. Isso me ensinou a diferença entre:

"É UM" (Herança): Um Ar-condicionado Portátil é um Ar-condicionado.

"TEM UM" (Composição): Um Ar-condicionado tem um Filtro.

4. Herança e o Fim da Duplicação
Através do desafio FiapDelivery, entendi como a Herança economiza tempo e código. Em vez de repetir placa e capacidade em Moto e Caminhao, criei a superclasse Veiculo. Isso facilita a manutenção: se eu precisar mudar algo comum a todos os veículos, mudo em apenas um lugar.

5. Polimorfismo: O Poder das Múltiplas Formas
Este foi um dos maiores saltos. Aprendi a "desengessar" o código. Ao fazer com que uma Rota aceite um Veiculo genérico, o sistema tornou-se escalável. O uso de Lists tipadas com a Superclasse e o laço for me permitiu tratar objetos diferentes de forma uniforme, invocando o comportamento específico de cada um através da sobrescrita (@Override).

6. Abstração e Interfaces: O Design Profissional
Finalmente, entendi como criar "contratos" no código:

Classes Abstratas: Usei para impedir a criação de objetos genéricos (como um ArCondicionado puro), forçando a especialização.

Interfaces: Implementei a DispositivoInteligente para adicionar capacidades específicas (como Wi-Fi) sem poluir a hierarquia principal de herança. Isso ensinou que a arquitetura deve ser flexível e baseada em comportamentos.

🛠️ Tecnologias e Conceitos Aplicados
Linguagem: Java

Ferramentas: Eclipse IDE, Astah (UML), Git/GitHub

Pilares POO: Abstração, Encapsulamento, Herança e Polimorfismo.

Clean Code: Nomenclatura semântica e métodos com responsabilidade única.

Status do Projeto: Concluí com sucesso todos os microdesafios e o Checkpoint de refatoração de código legado, transformando um sistema "engessado" em uma solução orientada a objetos profissional.

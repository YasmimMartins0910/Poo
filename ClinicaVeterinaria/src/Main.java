import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    // Criando o animal
    FichaAnimal animal = new FichaAnimal("Cachorro", "Lulu", 4, "Pequeno");

    // Criando o tutor com agregação do animal
    Tutor tutor = new Tutor(1, "Yasmim", "123456789", animal);

    // Criando um serviço
    Servico banho = new Servico(
            1,
            "Banho",
            50,
            true,
            Arrays.asList("Cachorro", "Gato")
    );

    // Criando um medicamento
    Medicamento remedio = new Medicamento(
            2,
            "Vermífugo",
            30,
            10,
            Arrays.asList("Cachorro")
    );

    // Abrindo atendimento
    Atendimento atendimento = new Atendimento(1, tutor);

    // Adicionando itens
    atendimento.adicionarItem(banho, 1, banho.getPreco(), 10);
    atendimento.adicionarItem(remedio, 2, remedio.getPreco(), 5);

    // Aplicando desconto
    atendimento.aplicarDesconto(5);

    // Finalizando atendimento
    atendimento.finalizar();

    // Mostrando o resumo
    atendimento.resumo();
  }
}
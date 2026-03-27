public class Tutor {

    // Encapsulamento: atributos privados
    private int id;
    private String nome;
    private String cpf;

    // Agregação: o tutor possui um animal (FichaAnimal)
    private FichaAnimal animal;

    public Tutor(int id, String nome, String cpf, FichaAnimal animal) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.animal = animal;
    }

    public FichaAnimal getAnimal() {
        return animal;
    }

    public String getNome() {
        return nome;
    }
}
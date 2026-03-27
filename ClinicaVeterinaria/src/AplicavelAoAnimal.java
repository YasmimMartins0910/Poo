// Interface que define comportamentos para itens que podem ser aplicados a um animal
// Tanto Servico quanto Medicamento devem implementar essa interface
public interface AplicavelAoAnimal {

    boolean aplicavel(FichaAnimal a);

    String getDescricao();

}
import java.util.List;

// Medicamento também implementa a interface AplicavelAoAnimal
// permitindo que seja tratado da mesma forma que um serviço
public class Medicamento implements AplicavelAoAnimal {

    // Encapsulamento: atributos privados
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;
    private List<String> especiesPermitidas;
    private int idadeMinima;
    private int idadeMaxima;

    public Medicamento(int codigo, String nome, double preco, int estoque, List<String> especiesPermitidas) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.especiesPermitidas = especiesPermitidas;
    }

    public int getEstoque() {
        return estoque;
    }

    public void reduzirEstoque(int q) {
        estoque -= q;
    }

    public void devolverEstoque(int q) {
        estoque += q;
    }

    public double getPreco() {
        return preco;
    }

    // Verifica se o medicamento pode ser aplicado ao animal
    @Override
    public boolean aplicavel(FichaAnimal a) {
        return especiesPermitidas.contains(a.getEspecie());
    }

    @Override
    public String getDescricao() {
        return nome;
    }
}
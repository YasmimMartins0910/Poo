import java.util.List;

// Servico implementa a interface AplicavelAoAnimal
// Isso permite que ele seja tratado de forma genérica no sistema
public class Servico implements AplicavelAoAnimal {

    private int codigo;
    private String nome;
    private double preco;
    private boolean ativo;
    private List<String> especiesPermitidas;
    private String porteMinimo;
    private String porteMaximo;

    public Servico(int codigo, String nome, double preco, boolean ativo, List<String> especiesPermitidas) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.ativo = ativo;
        this.especiesPermitidas = especiesPermitidas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public double getPreco() {
        return preco;
    }

    // Verifica se o serviço pode ser aplicado ao animal
    @Override
    public boolean aplicavel(FichaAnimal a) {
        return especiesPermitidas.contains(a.getEspecie());
    }

    @Override
    public String getDescricao() {
        return nome;
    }
}
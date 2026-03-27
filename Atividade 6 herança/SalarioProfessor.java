public class SalarioProfessor extends Rendimento {
    private int titulacao;

    public SalarioProfessor(String descricao, double valorBase, int titulacao) {
        super(descricao, valorBase);
        this.titulacao = titulacao;
    }

    @Override
    public double calcularValor() {
        if (titulacao == 2) return valorBase * 1.2;
        if (titulacao == 3) return valorBase * 1.4;
        return valorBase;
    }
}
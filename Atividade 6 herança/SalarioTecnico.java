public class SalarioTecnico extends Rendimento {
    private int nivel;

    public SalarioTecnico(String descricao, double valorBase, int nivel) {
        super(descricao, valorBase);
        this.nivel = nivel;
    }

    @Override
    public double calcularValor() {
        if (nivel == 2) return valorBase * 1.15;
        if (nivel == 3) return valorBase * 1.3;
        return valorBase;
    }
}
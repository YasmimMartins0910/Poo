public class Bolsa extends Rendimento {
    private int tipo;

    public Bolsa(String descricao, double valorBase, int tipo) {
        super(descricao, valorBase);
        this.tipo = tipo;
    }

    @Override
    public double calcularValor() {
        return (tipo == 1) ? valorBase : valorBase * 0.5;
    }
}
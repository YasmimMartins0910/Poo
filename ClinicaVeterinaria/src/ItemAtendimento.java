public class ItemAtendimento {

    // Uso de interface: o item pode ser Servico ou Medicamento
    private AplicavelAoAnimal item;

    private int quantidade;
    private double precoUnitarioSnapshot;
    private double descontoPercent;

    public ItemAtendimento(AplicavelAoAnimal item, int quantidade, double preco, double descontoPercent) {
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitarioSnapshot = preco;
        this.descontoPercent = descontoPercent;
    }

    public double subtotalBruto() {
        return quantidade * precoUnitarioSnapshot;
    }

    public double subtotalComDesconto() {
        return subtotalBruto() * (1 - descontoPercent / 100);
    }

    public AplicavelAoAnimal getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
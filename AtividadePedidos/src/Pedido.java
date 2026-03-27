import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;

    private List<ItemPedido> itens;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    public boolean adicionarProduto(Produto produto) {

        // Regra 1: não aceitar produto nulo
        if (produto == null) {
            return false;
        }

        return produtos.add(produto);
    }

    public boolean adicionarItem(ItemPedido item) {

        // Regra 2: item não pode ser nulo
        if (item == null) {
            return false;
        }

        // Regra 3: limite de 10 itens por pedido
        if (itens.size() >= 10) {
            System.out.println("Limite de itens atingido.");
            return false;
        }

        return itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void resumoPedido() {

        // Regra 4: pedido precisa ter pelo menos 1 item
        if (itens.isEmpty()) {
            System.out.println("Pedido vazio.");
            return;
        }

        System.out.println("Cliente: " + cliente.resumo());
        System.out.println("Itens do pedido:");

        for (ItemPedido item : itens) {
            System.out.println(item.resumo());
        }

        System.out.println("Total: R$ " + calcularTotal());
    }
}
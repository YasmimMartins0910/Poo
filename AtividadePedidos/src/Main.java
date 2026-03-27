public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Yasmim", "yasmim@email.com");

        Produto p1 = new Produto("Notebook", 3500);
        Produto p2 = new Produto("Mouse", 80);
        Produto p3 = new Produto("Teclado", 150);

        ItemPedido item1 = new ItemPedido(p1, 1);
        ItemPedido item2 = new ItemPedido(p2, 2);
        ItemPedido item3 = new ItemPedido(p3, 1);

        Pedido pedido = new Pedido(cliente);

        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);
        pedido.adicionarProduto(p3);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        pedido.resumoPedido();
    }
}

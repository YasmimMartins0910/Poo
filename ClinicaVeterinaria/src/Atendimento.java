import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private int numero;

    // Agregação: atendimento possui um tutor
    private Tutor tutor;

    // Agregação: atendimento possui vários itens
    private List<ItemAtendimento> itens;

    private String status;
    private double descontoAtendimentoPercent;

    public Atendimento(int numero, Tutor tutor) {
        this.numero = numero;
        this.tutor = tutor;
        this.itens = new ArrayList<>();
        this.status = "ABERTO";
    }

    public void adicionarItem(AplicavelAoAnimal item, int quantidade, double preco, double desconto) {

        if (!status.equals("ABERTO")) {
            System.out.println("Atendimento fechado.");
            return;
        }

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }

        if (desconto > 20) {
            System.out.println("Desconto máximo do item é 20%");
            return;
        }

        if (!item.aplicavel(tutor.getAnimal())) {
            System.out.println("Item não aplicável ao animal.");
            return;
        }

        ItemAtendimento novo = new ItemAtendimento(item, quantidade, preco, desconto);
        itens.add(novo);

        // Se for medicamento, reduz estoque
        if (item instanceof Medicamento) {
            ((Medicamento) item).reduzirEstoque(quantidade);
        }
    }

    public double totalBruto() {
        double total = 0;

        for (ItemAtendimento i : itens) {
            total += i.subtotalBruto();
        }

        return total;
    }

    public double totalComDescontoItens() {
        double total = 0;

        for (ItemAtendimento i : itens) {
            total += i.subtotalComDesconto();
        }

        return total;
    }

    public double totalFinal() {
        return totalComDescontoItens() * (1 - descontoAtendimentoPercent / 100);
    }

    public void aplicarDesconto(double desconto) {

        if (desconto <= 10) {
            descontoAtendimentoPercent = desconto;
        }
    }

    public void finalizar() {

        if (itens.size() == 0) {
            System.out.println("Não é possível finalizar sem itens.");
            return;
        }

        status = "FINALIZADO";
    }

    public void resumo() {

        System.out.println("Tutor: " + tutor.getNome());
        System.out.println("Animal: " + tutor.getAnimal().resumo());

        System.out.println("Total bruto: " + totalBruto());
        System.out.println("Total com desconto itens: " + totalComDescontoItens());
        System.out.println("Total final: " + totalFinal());
    }
}

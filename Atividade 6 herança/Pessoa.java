import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected List<ItemRendimento> rendimentos = new ArrayList<>();

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void adicionarRendimento(Rendimento r, int qtd) {
        if (qtd > 0) rendimentos.add(new ItemRendimento(r, qtd));
    }

    public abstract String getDadosEspecificos();

    public void imprimirResumo() {
        System.out.println("\n--- RESUMO DO CADASTRO ---");
        System.out.println("Nome: " + nome + " | CPF: " + cpf);
        System.out.println("Endereço: " + endereco.rua + " - " + endereco.cidade + "/" + endereco.uf);
        System.out.println(getDadosEspecificos());
        
        double totalGeral = 0;
        System.out.println("\nRENDIMENTOS:");
        for (ItemRendimento item : rendimentos) {
            double vCalc = item.rendimento.calcularValor();
            double subtotal = vCalc * item.quantidade;
            totalGeral += subtotal;
            System.out.printf("- %s | Base: R$%.2f | Calc: R$%.2f | Qtd: %d | Sub: R$%.2f\n",
                item.rendimento.getDescricao(),
                item.rendimento.getValorBase(),
                vCalc,
                item.quantidade,
                subtotal);
        }
        System.out.printf("\nTOTAL GERAL: R$%.2f\n", totalGeral);
    }
}

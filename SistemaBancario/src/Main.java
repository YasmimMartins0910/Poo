public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("001", "Ana", "CC");

        c1.abrirConta();
        c1.depositar(100);
        c1.sacar(30);
        c1.pagarMensal();
        c1.exibirStatus();
        c1.fecharConta();
    }
}
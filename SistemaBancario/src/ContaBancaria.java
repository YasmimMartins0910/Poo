public class ContaBancaria {

    public String numConta;
    private String tipo;
    public String dono;
    protected double saldo;
    protected boolean status;

    public ContaBancaria(String numConta, String dono, String tipo) {
        this.numConta = numConta;
        this.dono = dono;

        if (tipo.equals("CC") || tipo.equals("CP")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido! Use 'CC' ou 'CP'.");
            this.tipo = "CC";
        }

        this.status = false;
        this.saldo = 0;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void abrirConta() {
        if (!this.status) {
            this.status = true;

            if (this.tipo.equals("CC")) {
                this.saldo += 50;
            } else if (this.tipo.equals("CP")) {
                this.saldo += 150;
            }

            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Conta já está aberta.");
        }
    }

    public void fecharConta() {
        if (this.saldo != 0) {
            System.out.println("Conta não pode ser fechada: saldo diferente de zero.");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Não é possível sacar: conta fechada.");
        }
    }

    public void depositar(double valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Não é possível depositar: conta fechada.");
        }
    }

    public void pagarMensal() {
        if (this.status) {
            double valor = 0;

            if (this.tipo.equals("CC")) {
                valor = 12;
            } else if (this.tipo.equals("CP")) {
                valor = 20;
            }

            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para pagar mensalidade.");
            }

        } else {
            System.out.println("Conta fechada.");
        }
    }

    public void exibirStatus() {
        System.out.println("----- STATUS DA CONTA -----");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Dono: " + this.dono);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Status: " + (this.status ? "Aberta" : "Fechada"));
        System.out.println("---------------------------");
    }
}
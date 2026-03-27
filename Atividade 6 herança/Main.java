import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Dados Pessoais ---");
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("CPF: "); String cpf = sc.nextLine();
        
        System.out.print("Rua: "); String rua = sc.nextLine();
        System.out.print("Cidade: "); String cidade = sc.nextLine();
        System.out.print("UF: "); String uf = sc.nextLine();
        System.out.print("CEP: "); String cep = sc.nextLine();
        Endereco end = new Endereco(rua, cidade, uf, cep);

        System.out.println("\nTipo: (1) Aluno (2) Professor (3) Técnico");
        int escolhaP = sc.nextInt(); sc.nextLine();
        
        Pessoa p = null;
        if (escolhaP == 1) {
            System.out.print("Matrícula: "); String m = sc.nextLine();
            System.out.print("Curso: "); String c = sc.nextLine();
            p = new Aluno(nome, cpf, end, m, c);
        } else if (escolhaP == 2) {
            System.out.print("SIAPE: "); String s = sc.nextLine();
            System.out.print("Área: "); String a = sc.nextLine();
            p = new Professor(nome, cpf, end, s, a);
        } else {
            System.out.print("Registro: "); String r = sc.nextLine();
            System.out.print("Setor: "); String s = sc.nextLine();
            p = new Tecnico(nome, cpf, end, r, s);
        }

        String op = "s";
        while (op.equalsIgnoreCase("s")) {
            System.out.println("\n--- Adicionar Rendimento ---");
            System.out.println("(1) Bolsa (2) Salário Prof (3) Salário Téc");
            int tipoR = sc.nextInt(); sc.nextLine();
            
            System.out.print("Descrição: "); String desc = sc.nextLine();
            System.out.print("Valor Base: "); double base = sc.nextDouble();
            
            Rendimento r = null;
            if (tipoR == 1) {
                System.out.print("Tipo (1-Integral / 2-Parcial): ");
                r = new Bolsa(desc, base, sc.nextInt());
            } else if (tipoR == 2) {
                System.out.print("Titulação (1-Grad / 2-Mest / 3-Dout): ");
                r = new SalarioProfessor(desc, base, sc.nextInt());
            } else {
                System.out.print("Nível (1-Jr / 2-Pleno / 3-Sênior): ");
                r = new SalarioTecnico(desc, base, sc.nextInt());
            }
            
            System.out.print("Quantidade: ");
            p.adicionarRendimento(r, sc.nextInt());

            System.out.print("Deseja continuar? (s/n): ");
            op = sc.next();
            sc.nextLine();
        }

        p.imprimirResumo();

        sc.close();
    }
}

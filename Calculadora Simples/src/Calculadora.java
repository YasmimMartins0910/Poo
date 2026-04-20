public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }

    public int calcular(int a, int b, char operador) throws OperadorInvalidoException {

        if (operador == '+') {
            return soma(a, b);
        } else if (operador == '-') {
            return subtracao(a, b);
        } else if (operador == '*') {
            return multiplicacao(a, b);
        } else if (operador == '/') {
            return divisao(a, b);
        } else {
            throw new OperadorInvalidoException("Operador inválido! Use +, -, * ou /.");
        }
    }
}

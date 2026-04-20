public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    try {
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o operador (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        int resultado = calc.calcular(a, b, op);

        System.out.println("Resultado: " + resultado);

    } catch (InputMismatchException e) {
        System.out.println("Erro: digite apenas números inteiros.");

    } catch (ArithmeticException e) {
        System.out.println("Erro: divisão por zero não é permitida.");

    } catch (OperadorInvalidoException e) {
        System.out.println("Erro: " + e.getMessage());

    } finally {
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
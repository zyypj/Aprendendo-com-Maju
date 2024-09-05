import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Emprestimos Itaú");
        System.out.println("");
        System.out.println("Qual o valor do seu emprestimo desejado?");
        double emprestimo = entrada.nextDouble();
        
        double x12 = emprestimo / 12;
        double x24 = emprestimo / 24;
        System.out.println("");
        System.out.println("Emprestimos Itaú");
        System.out.println("");
        System.out.println("Valor do emprestimo: " + emprestimo);
        System.out.println("");
        System.out.println("Prestações disponíveis: ");
        System.out.println("1 - 12x de " + x12);
        System.out.println("2 - 24x de " + x24);
        System.out.println("");
        System.out.println("Escolha uma das opções: ");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("");
            System.out.println("Emprestimos Itaú");
            System.out.println("");
            System.out.println("Valor do emprestimo: " + emprestimo);
            System.out.println("");
            System.out.println("Prestações selecionadas: ");
            System.out.println("12x de " + x12);
            System.out.println("");
            System.out.println("Digite seu salário (R$): ");
            double salario = entrada.nextDouble();

            double salarioP20 = salario + salario % 20;

            if (salario > salarioP20) {
                System.out.println("Empréstimo concedido");
                return;
            } else {
                System.out.println("Empréstimo não concecido");
                return;
            }
        } else if (opcao == 2) {
            System.out.println("");
            System.out.println("Emprestimos Itaú");
            System.out.println("");
            System.out.println("Valor do emprestimo: " + emprestimo);
            System.out.println("");
            System.out.println("Prestações selecionadas: ");
            System.out.println("24x de " + x24);
            System.out.println("");
            System.out.println("Digite seu salário (R$): ");
            double salario = entrada.nextDouble();

            double salarioP20 = salario + salario % 20;

            if (salario > salarioP20) {
                System.out.println("Empréstimo concedido");
                return;
            } else {
                System.out.println("Empréstimo não concecido");
                return;
            }
        } else {
            System.out.println("Opção não encontrada.");
            return;
        }
    }
}

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Calculadora");
        System.out.println("");
        System.out.println("Escolha alguma operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("");
        int operacao = entrada.nextInt();

        if (operacao == 1) {
            System.out.println("");
            System.out.println("Operação SOMA selecionada.");
            System.out.println("");
            System.out.println("Fale o primeiro número: ");
            float n1 = entrada.nextInt();

            System.out.println(n1 + " selecionado.");
            System.out.println("");
            System.out.println("Fale o segundo número: ");
            float n2 = entrada.nextInt();

            System.out.println(n1 + " + " + n2);
            System.out.println("é igual a:");
            float resultado = n1 + n2;
            System.out.println(resultado);

        } else if (operacao == 2) {
            System.out.println("");
            System.out.println("Operação SUBTRAÇÃO selecionada.");
            System.out.println("");
            System.out.println("Fale o primeiro número: ");
            float n1 = entrada.nextInt();

            System.out.println(n1 + " selecionado.");
            System.out.println("");
            System.out.println("Fale o segundo número: ");
            float n2 = entrada.nextInt();

            System.out.println(n1 + " - " + n2);
            System.out.println("é igual a:");
            float resultado = n1 - n2;
            System.out.println(resultado);

        } else if (operacao == 3) {
            System.out.println("");
            System.out.println("Operação MULTIPLICAÇÃO selecionada.");
            System.out.println("");
            System.out.println("Fale o primeiro número: ");
            float n1 = entrada.nextInt();

            System.out.println(n1 + " selecionado.");
            System.out.println("");
            System.out.println("Fale o segundo número: ");
            float n2 = entrada.nextInt();

            System.out.println(n1 + " x " + n2);
            System.out.println("é igual a:");
            float resultado = n1 * n2;
            System.out.println(resultado);

        } else if (operacao == 4) {
            System.out.println("");
            System.out.println("Operação DIVISÃO selecionada.");
            System.out.println("");
            System.out.println("Fale o primeiro número: ");
            float n1 = entrada.nextInt();

            System.out.println(n1 + " selecionado.");
            System.out.println("");
            System.out.println("Fale o segundo número: ");
            float n2 = entrada.nextInt();

            System.out.println(n1 + " / " + n2);
            System.out.println("é igual a:");
            float resultado = n1 / n2;
            System.out.println(resultado);
        } else {
            System.out.println("");
            System.out.println("Operação inválida.");
            System.out.println("");
            System.out.println("Tente novamente.");
            System.out.println("");
            System.out.println("Escolha alguma operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("");
            operacao = entrada.nextInt();
        }


        entrada.close();
    }

}

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Escreva um número: ");
        int n1 = entrada.nextInt();

        System.out.println("");
        System.out.println("Número " + n1 + " escolhido!");
        System.out.println("");
        System.out.println("Escreva outro número: ");
        int n2 = entrada.nextInt();

        if (n1 > n2) { 
            System.out.println("");
            System.out.println("O maior número entre " + n1 + " e " + n2 + " é: ");
            System.out.println(n1);
            System.out.println("");
            System.out.println("E o menor número é: ");
            System.out.println(n2);
        }

        if (n1 < n2) { 
            System.out.println("");
            System.out.println("O maior número entre " + n2 + " e " + n1 + " é: ");
            System.out.println(n2);
            System.out.println("");
            System.out.println("E o menor número é: ");
            System.out.println(n1);
        }

        entrada.close();
    }
}

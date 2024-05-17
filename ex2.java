import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n1 = entrada.nextInt();

        System.out.println("Insira outro número: ");
        int n2 = entrada.nextInt();

        System.out.println("Insira outro número: ");
        int n3 = entrada.nextInt();
        
        System.out.println("");
        System.out.println("Soma dos números: ");
        System.out.println((n1 + n2 + n3));

        entrada.close();
    }
}

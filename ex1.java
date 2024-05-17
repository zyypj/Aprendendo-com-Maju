import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = entrada.nextInt();
        
        System.out.println("Número escolhido: " + numero);

        System.out.println("Número sucessor: " + (numero + 1));

        System.out.println("Número antecessor: " + (numero - 1));

        entrada.close();
    }
}
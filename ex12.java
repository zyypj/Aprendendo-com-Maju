import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Digite um número: ");
        double numero = entrada.nextInt();

        if (numero > 0) {
            double numeroQu = (numero * numero);
            double numeroRa = Math.sqrt(numero);
            System.out.println("Número escolhido: " + numero);
            System.out.println("Número digitado ao quadrado: " +  numeroQu);
            System.out.println("Raiz quadrada do número: " + numeroRa);

            entrada.close();
            return;
        } else {
            System.out.println("Número não é positivo.");
        }
        entrada.close();
    }
}

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float dollar = 5.10f;

        System.out.println("Conversor da Cotação do Dolar");
        System.out.println("");
        System.out.println("Cotação atual do Dolar($): " + dollar);
        System.out.println("");
        System.out.println("Escreva quantos Dolares você deseja transformar");
        System.out.println("em Real:");
        float real = entrada.nextFloat();
        
        System.out.println("");
        System.out.println("Resultado:");
        System.out.println("R$" + real * dollar);

        entrada.close();
    }
}
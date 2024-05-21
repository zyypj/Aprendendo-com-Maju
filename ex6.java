import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Escreva quantos Celsius você quer transformar");
        System.out.println("em Fahrenheit:");
        float c = entrada.nextFloat();

        double calc = c * (9.0/5.0) + 32;
        
        System.out.println("");
        System.out.println(c + " Celsius em Fahrenheit é: " + calc);

        entrada.close();
    }
}

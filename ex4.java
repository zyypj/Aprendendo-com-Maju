import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("CALCULADORA DE VELOCIDADE");
        System.out.println("");
        System.out.println("Insira uma velocidade em KM/h:");
        int km = entrada.nextInt();

        System.out.println("");
        System.out.println("Velocidade em M/s:");
        float result = km / 3.6f;
        System.out.println(result);

        entrada.close();
    }   
}

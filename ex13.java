import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Fale seu gênero: ");
        System.out.println("1 - Homem");
        System.out.println("2 - Mulher");
        System.out.println("");
        int genero = entrada.nextInt();

        if (genero == 1) {
            System.out.println("");
            System.out.println("Gênero homem escolhido");
            System.out.println("Informe sua altura (metros): ");
            System.out.println("");
            float h = entrada.nextInt();
            double calc = (72.2 * h) - 58;

            System.out.println("");
            System.out.println("Seu peso ideal é: " + calc);
        } else if (genero == 2) {
            System.out.println("");
            System.out.println("Gênero mulher escolhido");
            System.out.println("Informe sua altura (metros): ");
            System.out.println("");
            float h = entrada.nextInt();
            double calc = (62.1 * h) - 44.7;

            System.out.println("");
            System.out.println("Seu peso ideal é: " + calc);
        } else {
            System.out.println("Gênero não identificado");
        }

        entrada.close();
    }
}

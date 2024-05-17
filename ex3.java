import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Escreva o ano atual: ");
        int anoAtual = entrada.nextInt();
        
        System.out.println("Você já fez aniversario esse ano?");
        boolean aniversario = entrada.nextBoolean();

        if (aniversario) {
            System.out.println("Seu ano de nascimento é: ");
            System.out.println(anoAtual - idade);
        }

        System.out.println("Seu ano de nascimento é: ");
        System.out.println(anoAtual - idade - 1);

        entrada.close();
    }
}

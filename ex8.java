import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Bem vindo ao Cadastro de Produtos do Lucas");
        System.out.println("");
        System.out.println("Insira o nome do produto que deseja cadastrar: ");
        String nome = entrada.nextLine();

        System.out.println("");
        System.out.println("Cadastro de Produtos do Lucas");
        System.out.println("");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Insira o modelo do produto: ");
        String modelo = entrada.nextLine();

        System.out.println("");
        System.out.println("Cadastro de Produtos do Lucas");
        System.out.println("");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Modelo do Produto: " + modelo);
        System.out.println("Insira o tamanho do produto (centímetros): ");
        float tamanho = entrada.nextFloat();

        System.out.println("");
        System.out.println("Cadastro de Produtos do Lucas");
        System.out.println("");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Modelo do Produto: " + modelo);
        System.out.println("Tamanho do Produto: " + tamanho + "cm");
        System.out.println("Insira o preço do produto (reais): ");
        float preço = entrada.nextFloat();

        System.out.println("");
        System.out.println("Cadastro de Produtos do Lucas");
        System.out.println("");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Modelo do Produto: " + modelo);
        System.out.println("Tamanho do Produto: " + tamanho + "cm");
        System.out.println("Preço do Produto: " + "R$" + preço);
        System.out.println("Insira a quantidade em estoque do produto (unidades): ");
        int quantidade = entrada.nextInt();
        
        System.out.println("");
        System.out.println("Cadastro de Produtos do Lucas");
        System.out.println("");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Modelo do Produto: " + modelo);
        System.out.println("Tamanho do Produto: " + tamanho + "cm");
        System.out.println("Preço do Produto: " + "R$" + preço);
        System.out.println("Quantidade em Estoque do Produto: " + quantidade + " unidades");
        System.out.println("");
        System.out.println("CADASTRO FINALIZADO!");
        
        entrada.close();
    }
}

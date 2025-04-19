package conditionals;

import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
        /*
            * Exercício: Classificação de produto
            Ter três produtos catalogados;
            Pedir o nome do produto; 
            Verificar se o produto está catalogado;
            Se sim, podemos pedir para alterar o preço do produto ou não;
                - Se alterar o preço, exibir classificação abaixo( nome e novo preço);
                - Se não, encerrar programa;
            Se não, pedir o preço do produto; 
                -Exibir cllassificação;
            ?Classificações: preço < 50 = barato, de 50 a 100 = moderado, acima de 100 = caro;
            Exibir no final, nome e preço do produto.

         */
        
        Scanner scanner = new Scanner(System.in);

        String productOne = "detergente";
        String productTwo = "sabonete"; 
        String productThree = "escova"; 

        System.out.println("Digite o produto que você deseja pesquisar: ");

        String searchProduct = scanner.nextLine().toLowerCase();
        char isChangePrice;
        double price;

        if (searchProduct.equals(productOne) || searchProduct.equals(productTwo) || searchProduct.equals(productThree)) {
            System.out.println("Você deseja alterar o preço do produto? Digite S(Sim) ou N(Não)");
            isChangePrice = scanner.next().toLowerCase().charAt(0);
            switch (isChangePrice) {
                case 's':
                    System.out.println("Digite o preço do produto");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    if (price < 50) {
                        System.out.println("Legal, o produto " + searchProduct + " tem o valor de: R$" + price + ", está baratinho!");
                    } else if (price >= 50 && price <= 100) {
                        System.out.println("Legal, o produto " + searchProduct + " tem o valor de: R$" + price + ", está com preço médio de mercado!!");
                    } else {
                        System.out.println("Legal, o produto " + searchProduct + " tem o valor de: R$" + price + ", está caro em?");
                    }
                    break;

                case 'n':
                    System.out.println("Ok, encerrando sistema");
                    break;
            
                default:
                    System.out.println("Você precisa digitar (S)Sim ou N(Não), tente novamente!");
                    break;
            }
        } else System.out.println("O produto não está catalogado, Tente novamwnte!");
    }
}

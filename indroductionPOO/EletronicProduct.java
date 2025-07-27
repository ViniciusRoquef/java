package indroductionPOO;

public class EletronicProduct {
    /*
        *> Exercício 4: Classe ProdutoEletronico com Método dentro de Método

        Crie uma classe ProdutoEletronico com as propriedades nome, preco, e garantia. 
        Implemente um método para aplicar desconto no preço e, dentro desse método, 
        chame outro método que calcula o valor do desconto. 
        Crie um objeto da classe ProdutoEletronico, aplique o desconto 
        e exiba as informações após a alteração do preço.
     */

    private String nameProduct;
    private double priceProduct;
    private boolean guarantee;

    public void product(String name, double priceProduct, boolean guarantee) {
        this.nameProduct = name;
        this.priceProduct = priceProduct;
        this.guarantee = guarantee;
    }

    public void applyDiscount(double discount) {
        System.out.println( "O produto "+ this.nameProduct + " ficou no valor de R$"+ this.calculateDiscount(discount));
    }

    public double calculateDiscount(double discount) {
        return this.priceProduct - discount;
    }
}

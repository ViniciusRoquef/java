package indroductionPOO;

public class Product {
    
    private String name;
    private float price; 

    public void setNameOfProduct(String name) {
        if (name != null && name.length() > 3 && name != "") {
            this.name = name;
        } else {
            System.out.println("O nome do produto está inválido, tente novamente!");
        }
    }

    public void setPriceOfProduct(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("O valor deve ser maior que 0");
        }
    }

    public String getPrice() {
        return String.format("R$%.2f ", this.price);
    }

    public String getDataOfProduct() {
        return "O produto é: " + this.name + " e tem valor" + getPrice();
    }
}

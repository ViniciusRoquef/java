package advancedPOO;

public class CreditCard implements Payment {

    @Override
    public void Payment(double valor) {
        System.out.println(" O valor da compra fopi de R$" + valor);
    }
    
}

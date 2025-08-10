package advancedPOO;

public interface Payment {

    public void Payment(double valor);
    
    default void displayReceipt(double valor) {
        System.out.println("Recibo de pagamento no valor de R$" + valor);
    }
}
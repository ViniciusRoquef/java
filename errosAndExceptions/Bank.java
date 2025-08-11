package errosAndExceptions;

public class Bank {
    
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double sake) throws SakeInsuficietException {
        if (sake > balance) {
            throw new SakeInsuficietException("Saldo insuficiente " + balance);
        }

        balance -= sake;

        System.out.println("O valor do saque é: " + balance);
    }
}

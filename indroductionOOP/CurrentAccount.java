package indroductionOOP;

public class CurrentAccount {
    /*
         *> Exercício 3: Classe ContaCorrente com Métodos e Encapsulamento

        Implemente uma classe ContaCorrente com as propriedades privadas titular, saldo e limiteSaque. 
        Crie os métodos para depositar(), sacar() e exibirSaldo(). 
        O método de saque deve verificar se o valor é menor ou igual ao limite de saque 
        e se o saldo é suficiente. 
        Crie dois objetos da classe ContaCorrente e teste os métodos criados.
     */

    private String holder;
    private double balance;
    private double cache;
    private double withdrawalLimit;

    public void accountData( String holder, double cache) {
        this.holder = holder;
        this.cache = this.deposit(cache);
        this.withdrawalLimit = 300;
    }

    private double deposit( double cache) {
        return this.balance = cache;
    }

    public double displayBalance() {
        return this.balance;
    }

    public void withdraw( double cache) {
        System.out.println(this.balance);
        if (this.balance > cache) {
            if (cache > this.withdrawalLimit) {
                System.out.println(this.holder + " o saque previsto superior ao seu limite de saque diário.");
            } else {
                System.out.println(this.holder + " o seu saldo atual passou a ser: " + ( this.balance - cache));
            }
        } else {
            System.out.println(this.holder + " o valor do saque maior que o valor atual da conta");
        }
    }
}

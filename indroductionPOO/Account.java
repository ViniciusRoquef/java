package indroductionPOO;

public class Account {
    
    //Conta de banco

    private String person;
    private double balance;

    public void setCheckPerson(String person) {
        if (person != null || person.isEmpty()) {
            this.person = person;
        } else {
            System.out.println("Usuário inválido");
        }
    }

    public void setbalance( double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Saldo negativo! Tente novamente");
        }
    }

    public void getAccount() {
        System.out.println("O usuário da conta é: " + person + " e o seu saldo é " + balance);
    }
}

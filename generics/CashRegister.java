package generics;

public class CashRegister <T>{

    //T não é um tipo específico, é qualquer tipo.
    private T content;

    public void addMoney( T content) {
        this.content = content;
    }

    public T viewContent() {
        return this.content;
    }
}

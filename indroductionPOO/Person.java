package indroductionPOO;

public class Person {
    
    private String name;
    private String cpf;


    //Get e set são métodos utilizados para retorno/acesso de propriedades privadas
    public void setName( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCPF( String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }
}

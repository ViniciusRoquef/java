package indroductionOOP;

public class POO {
    public static void main(String[] args) {

        //Para criar um objeto, primeiro você precisa instaciar o objeto desejado e atriuir um nome a ele
        //Ex:
        Car audi = new Car();

        
        //Depois para acessar as propriedades/métodos do objeto, é necessario pegar o nome da instancia e colocar um ponto(.)
        audi.mark = "Audi ";
        audi.model = "Sedan";
        audi.name = "A3";
        audi.ageFrabrication = 2025;

        audi.showCar();


        //Instancinado método da classe
        audi.starEngine();

        audi.velocity(30);
        audi.velocity(40);


        //Propriedades privadas
        Person viniPerson = new Person();

        viniPerson.setCPF("10836653404");

        viniPerson.setName("Vinicius");

        System.out.println("O nome do usuário é " + viniPerson.getName() + " e o seu Cpf é:" + viniPerson.getCPF());


        //Setters
        Account NewAccount = new Account();

        NewAccount.setCheckPerson("Vinicius");
        NewAccount.setbalance(50);

        NewAccount.getAccount();

        //Lógica com Getters e Setters
        Product jeans = new Product();

        jeans.setNameOfProduct("Calça jeans");
        jeans.setPriceOfProduct(35);

        //?Métodos dentro de métodos
        System.out.println(jeans.getDataOfProduct());

        
        
        //Constructors
        //Pega o livro setado com os valores padrões;
        Books books = new Books();
        System.out.println(books.getBooks());

        //Info pega pelo metodo de Override
        Books books2 = new Books("Homem aranha", "Marvel", 1998);
        System.out.println(books2.getBooks());
    }
}

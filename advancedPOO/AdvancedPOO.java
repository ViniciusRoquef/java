package advancedPOO;

public class AdvancedPOO {
    
    public static void main(String[] args) {

        //1 - Object composition
        Engine engine1 = new Engine("V8", 500);

        Car car1 = new Car("Azul", "Ford", engine1);

        car1.showInfo();

        //2 - Herança
        Dog cachorro1 = new Dog("Luke", "Caramelow");
        cachorro1.Latir();
        cachorro1.makeSound();

        //3 - Classe object
        //? usada intrinsecamente no java, já que todas as classes herdam os métodos da classe Object. ex: .equels(), .toString()...

        Person vinicius = new Person("Vinicius", 23);
        Person pedro = new Person("Pedro", 24);

        System.out.println(vinicius.equals(pedro));
        System.out.println(pedro.toString());

        //4 - Usando Super

        Employee funcionario1 = new Employee("Halsey", 3000);
        Manager gerente1 = new Manager("Fabry", 5000, 1000);

        funcionario1.displayEmployee();
        gerente1.displayEmployee();
        System.out.println(funcionario1.calculateSalary());
        System.out.println(gerente1.calculateSalary());

        //5 - Classes abstratas
        Guitarra guitarra1 = new Guitarra("Guitarra geaninni");
        guitarra1.touch();

        //7 - Interfaces
        CreditCard valor1 = new CreditCard();
        valor1.Payment(300);
    }
}

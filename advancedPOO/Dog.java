package advancedPOO;

public class Dog extends Animales {

    //Realizando a HERANÇA a partir da instacianção das propriedades extendidas da classe pai através do metodo super.
    public Dog( String name, String color ) {
        super(name, color);
    }

    public void Latir() {
        System.out.println("O " + name + " está latindo.");
    }
}

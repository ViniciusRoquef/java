package advancedPOO;

public class Animales {
    
    protected String name;
    protected String color;
    
    public Animales( String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void makeSound( ) {
        System.out.println(this.name + " está emitindo som");
    }
}

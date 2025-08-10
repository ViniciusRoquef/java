package advancedPOO;

public class Guitarra extends MusicalInstrument {

    public Guitarra( String name ) {
        super(name);
    }

    @Override
    public void touch() {
        System.out.println("Estou tocando " + name);
    }
}

package advancedPOO;

abstract class MusicalInstrument {
    
    protected String name;

    public MusicalInstrument( String name) {
        this.name = name;
    }

    //Métodos abstratos devem ser implementados nas subclasses
    public abstract void touch();

    //Métodos concretos já são implemntados
    public void displayDatails() {
        System.out.println("O instrumento é " + name);
    }

}

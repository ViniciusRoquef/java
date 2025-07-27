package indroductionPOO;

import java.util.Arrays;

public class MasterClass {
    
    //Encapsulamento de arrays

    private String[] studants;

    public String[] addStudants( String[] studants) {
        return this.studants = Arrays.copyOf(studants, studants.length);
    } 
}

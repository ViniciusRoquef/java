package readingFiles;

import java.io.Serializable;;

public class People implements Serializable{
    
    public static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public People(String name, int idade) {
        this.name = name;
        this.age = age;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

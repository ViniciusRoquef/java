package indroductionOOP;

public class Books {
    
    private String author;
    private String name;
    private int yearOfRelease;

    //!Fallback: quando um constructor é criado, esse evento deixa esse objeto como padrão caso a função seja chamada sem valor
    public Books() {
        this.author = "J.K. Rolling";
        this.name = "Harry Potter e a pedra filosofal";
        this.yearOfRelease = 2005;
    }

    //! Override
    public Books(String name, String author, int yearOfRelease) {
        this.author = author;
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public String getBooks() {
        return "O nome do livro é " + this.name + " escrito pelo autor(a) " + this.author + " no ano de " + this.yearOfRelease;
    }
}

package indroductionPOO;

public class Library {
    /*
        *> Exercício 5: Classe LivroBiblioteca com Lógica em Setters e Getters

        Crie uma classe LivroBiblioteca com as propriedades privadas titulo, autor, e disponivel (boolean). 
        Adicione métodos para pegar emprestado (definindo disponivel como false) 
        e devolver o livro (definindo disponivel como true). 
        Nos setters e getters, adicione a lógica para verificar se o livro está disponível 
        ou já emprestado antes de permitir a ação. 
        Na classe principal, instancie dois livros e simule o processo de empréstimo e devolução.
    */
    
    private String author;
    private String title;
    private boolean isDisponible;

    public void setNameAuthor( String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Digite um nome válido");
        }
    }

    public void setTitleBook( String title ) {
        if (title != null) {
            this.title = title;
        } else {
            System.out.println("Digite um título válido!");
        }
    }

    public void setAvaliability( boolean isDisponible ) {
        this.isDisponible = isDisponible;
    }

    public String getBooks() {
        return "O nome do livro é " + this.title + " escrito pelo autor(a) " + this.author + ". Está disponível? " + this.isDisponible;
    }
}

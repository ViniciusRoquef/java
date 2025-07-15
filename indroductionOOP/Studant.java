package indroductionOOP;

public class Studant {

    /* 
        *> Exercício 2: Classe Aluno com Encapsulamento e Construtores

        Crie uma classe Aluno com as propriedades privadas nome, matricula, notaFinal. 
        Adicione um construtor parametrizado para inicializar essas propriedades e 
        implemente os setters e getters com validação para garantir
        que o nome não esteja vazio e a nota final esteja entre 0 e 100. 
        Na classe principal, crie dois objetos da classe Aluno, 
        atribua valores e exiba as informações.
    */

    private String name;
    private String registration;
    private double finalNote;

    public void studantInformation() {
        this.name = "Aluno teste";
        this.registration = "00000C";
        this.finalNote = 0.0;
    }

    public void studantInformation(String name, String registration, double finalNote) {
        this.name = name;
        this.registration = registration;
        this.finalNote = finalNote;
    }

    public void setStudantInformation() {
        if (name != null) {
            if (finalNote > 0 && finalNote < 100) {
                System.out.println(this.getStudantInformation());
            } else {
                System.out.println("A nota final precisa estar entre 0 e 100");
            }
        } else {
            System.out.println("Aluno não encontrado em nossa base de dados.");
        }
    }

    public String getStudantInformation() {
        return " O Aluno " + name + " com matrícula " + registration + " obteve uma nota final de " + finalNote;
    }
}
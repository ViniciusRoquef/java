package errosAndExceptions;

public class Erros {

    public static void main(String[] args) {
        //! - try catch = tratamentos de erros
        try {

            int a = 0;
            int b = 10;

            int resultado = b / a;

        } catch(ArithmeticException e ) {

            System.out.println("Não pode ser dividido.");
        }

        try {
            int[] numeros = {1,2,3};

            System.out.println(numeros[4]);
        } catch (Exception e) {
            // TODO: Esse Exception é um erro gerérico do java, usado quando você não sabe qual erro pode ser retornado.
            
            System.out.println("Erro genérico --> ");
            System.out.println(e.getMessage());
        }
    }   
}

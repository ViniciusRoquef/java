package errosAndExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Erros {

    public static void main(String[] args) {

        // 1 - try catch = tratamentos de erros
        try {

            int a = 0;
            int b = 10;

            int resultado = b / a;

        } catch(ArithmeticException e ) {

            System.out.println("Não pode ser dividido.");
        }

        //?----------------------------------------------------------------------------------------------------------------------------------------------

        try {
            int[] numeros = {1,2,3};

            System.out.println(numeros[4]);
        } catch (Exception e) {
            // TODO: Esse Exception é um erro gerérico do java, usado quando você não sabe qual erro pode ser retornado.
            
            System.out.println("Erro genérico --> ");
            System.out.println(e.getMessage());
        }

        //?----------------------------------------------------------------------------------------------------------------------------------------------
        //2 - Usando o Finally no final das excessões
        // O cenário do finally vai ser executado mesmo caindo no try, então entra nas duas situações do try_catch

        try {
            int[] numeros = {1,2,3};

            System.out.println(numeros[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Erro genérico finally --> ");
            System.out.println(" msg: " + e.getMessage());
        } finally {
            System.out.println("Entrou no finally");
        }

         //?----------------------------------------------------------------------------------------------------------------------------------------------
         //3- Excessões verificadas e não verificadas

         //verificada

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro de ação verificada");
        }

        //Não verificado
        // esses erros não darão erros de compilação e o java só irá acular após compilação;
        //String linh = null;

        //System.out.println(linh.length());

        //4- Usando o throw

        try {
            validarIdade(10);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(" Erro: " + e.getMessage());
        }

        //5- Usando excessões personalizadas

        Bank conta1 = new Bank(9000);

        try {
            conta1.withdraw(10000);
        } catch (SakeInsuficietException e) {
            System.out.println(e.getMessage());
        }

        // 6 - throws em métodos

        try {
            
            processarArquivo("/var/www/arquivo.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 7 - Encadeamento de exceções
        try {
            
            abrirArquivo(null);

        } catch (Exception e) {
            
            System.out.println("Mensagem: " + e.getMessage());

            System.out.println("Causa original: " + e.getCause());

        }

        // 8 - multicatch
        // dentro do catch, os tipos de erros são separados por ou "|"
        try {
            
            processarArquivo("asd");
            
        } catch (NullPointerException | IOException e) {
            
            System.out.println("Erro multicatch: " + e.getMessage());

        }



    }   

    public static void validarIdade( int idade ) {
        if ( idade < 18 ) {
            throw new IllegalArgumentException("Idade deve ser maior que 18 anos");        
        } else {
            System.out.println("Idade válida");
        }
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {

        if(caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho inválido.");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado.");
        }

        System.out.println("Arquivo encontrado com sucesso!");
    }

    public static void abrirArquivo(String caminho) {
        try {
            if (caminho == null) {
                throw new NullPointerException("Caminho nulo.");
            }

            throw new FileNotFoundException("Caminho inválido");
        } catch (FileNotFoundException e) {
            
            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");

            npe.initCause(e);

            throw npe;
        }
    }
}

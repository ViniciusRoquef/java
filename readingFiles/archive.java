package readingFiles;

import java.io.*;

public class archive {
    public static void main(String[] args) {
        
        //1 - Leitura de arquivos
        // No windows os arquivos são lidos com contra barra(\) já no linux é com /
        String currentDir = System.getProperty("user.dir") + "\\readingFiles\\";
        System.out.println(currentDir);
        System.out.println("C:\\Users\\Vinicius Roque\\Documents\\Estudos\\java-hora-codar\\readingFiles\\archive.java");

        //O fileHeader = ler caractere por caracter
        try(FileReader reader = new FileReader(currentDir + "fantasyText.txt")) {

            int caracter;

            while ((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }
            
        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo txt" + e.getMessage());
        }

        //O bufferedReader = ler linha por linha
        try(BufferedReader reader = new BufferedReader(new FileReader(currentDir + "fantasyText.txt"))) {

            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.print(linha);
            }
            
        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo txt" + e.getMessage());
        }
    }
}

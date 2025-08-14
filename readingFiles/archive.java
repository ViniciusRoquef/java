package readingFiles;

import java.io.*;

public class Archive {
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

        //2.1- Escrevendo arquivos com FileWriter
        try(FileWriter newFile = new FileWriter(currentDir + "newFile.txt")) {
            newFile.write("Criando novo texto dentro de um arquivo \n");
            
            newFile.write("Outro texto pulando linha dentro de um arquivo");
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser criado.");
        }

        //2.2- Escrevendo arquivos com BufferedRead
        try(BufferedWriter newFile2 = new BufferedWriter(new FileWriter(currentDir + "newFile2.txt"))) {
            newFile2.write("Criando novo texto dentro de um arquivo com BufferedWriter");
            newFile2.newLine();
            newFile2.write("Outro texto pulando linha dentro de um arquivo com BufferedWriter");
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser criado.");
        }

        //3 - Serialização de objetos;

        People name = new People("Vincius", 23);
        System.out.println(name.getName());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
            oos.writeObject(name);

            System.out.println("Objeto serializado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " + e.getMessage());
        }

    }
}

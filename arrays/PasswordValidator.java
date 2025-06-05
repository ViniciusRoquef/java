package arrays;

import java.util.Scanner;

/**
    1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

    2 - Receber Senha: Solicitar ao usuário que digite uma senha 
    e armazená-la em uma variável.

    3 - Verificar Força da Senha: Chamar o método verificarForcaSenha 
    para avaliar a força da senha.

    > mais de x caracteres +1
    > se tem letras  +1
    > se tem caracteres especiais +1
    > se tem numeros +1

    forca = 3

    'a senha tem seguranca média'

    4 - Avaliar e Exibir Resultado: Exibir uma mensagem indicando a força da senha 
    com base no valor retornado.

    5 - Fechar Scanner: Fechar o Scanner para liberar recursos.
 */

public class PasswordValidator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        int forca = verificarForcaSenha(senha);

        if(forca <= 2) {
            System.out.println("A sua senha é fraca.");
        } else if(forca == 3) {
            System.out.println("A sua senha é média.");
        } else if(forca == 4) {
            System.out.println("A sua senha é segura.");
        } else {
            System.out.println("A sua senha é muito forte.");
        }

        scanner.close();

    }

    public static int verificarForcaSenha(String senha) {

        int forca = 0;

        if(senha.length() > 8) {
            forca++;
        }

        if(senha.matches(".*[A-Z].*")) {
            forca++;
        }

        if(senha.matches(".*[a-z].*")) {
            forca++;
        }

        if(senha.matches(".*\\d.*")) {
            forca++;
        }

        if(senha.matches(".*[!@#$%&*()\\-_?<>].*")) {
            forca++;
        }

        return forca;

    }
}

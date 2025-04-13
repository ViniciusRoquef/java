package variables;

public class TestScanner {
    public static void main(String[] args) {
        // Scanner é uma classe que permite ler dados de entrada do usuário
        // A classe Scanner faz parte do pacote java.util, então precisamos importá-la
        // para usá-la em nosso código.
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicita ao usuário que insira seu nome
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine(); // Lê uma linha de texto digitada pelo usuário

        /*
         * Metodos que o Scanner possui:
         * next() -> Lê a próxima palavra digitada pelo usuário.
         * nextLine() -> Lê a próxima linha digitada pelo usuário.
         * nextInt() -> Lê o próximo número inteiro digitado pelo usuário.
         * nextDouble() -> Lê o próximo número decimal digitado pelo usuário.
         * nextBoolean() -> Lê o próximo valor booleano digitado pelo usuário.
         * nextFloat() -> Lê o próximo número decimal de precisão simples digitado pelo usuário.
         * nextLong() -> Lê o próximo número inteiro longo digitado pelo usuário.
         * nextShort() -> Lê o próximo número inteiro curto digitado pelo usuário.
         * nextByte() -> Lê o próximo número inteiro de byte digitado pelo usuário.
         * nextBigInteger() -> Lê o próximo número inteiro grande digitado pelo usuário.
         * nextBigDecimal() -> Lê o próximo número decimal grande digitado pelo usuário.
         */

        // Exemplo de uso do método nextInt() para ler um número inteiro
        System.out.print("Digite sua idade: ");
        int number = scanner.nextInt();
        
        // Exibe o nome digitado pelo usuário
        System.out.println("Seu nome é " + name + " e você possui " + number + " anos.");
        scanner.close();
    }
}

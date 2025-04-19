package methods;

public class Exercises3 {
    public static void main(String[] args) {
        System.out.println(dayForWeek(3));

        System.out.println(authentication("admin", "Mudar@123"));

    }

    //*Exercício 1: Utilize a function para indicar o dia da semana

    public static String dayForWeek(int numberOfDay ) {
        switch (numberOfDay) {
            case 1:
            return "Domingo";
            
            case 2:
            return "Segunda-feira";
            
            case 3:
            return "Terça-feira";
            
            case 4:
            return "Quarta-feira";
            
            case 5:
            return "Quinta-feira";
            
            case 6:
            return "Sexta-feira";
            
            case 7:
            return "Sábado-feira";
            
            default:
            return "Inválido, digite um número de 1 a 7.";
        }   
    }

    //* Faça um programa simulando o uso do System.exit() */

    public static String authentication( String user, String password ) {
        if ( !user.equals("admin") && !password.equals("Mudar@123") ) {
            System.out.println("Autenticação falhou, tente novamente");
            System.exit(1);
        }

        return "Bem vindo " + user;
    }
}

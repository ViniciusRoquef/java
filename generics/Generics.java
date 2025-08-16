package generics;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        
        //1 - Classes genéricas: Introdução
        CashRegister<Integer> tipo1 = new CashRegister<>();
        tipo1.addMoney(100);
        System.out.println(tipo1.viewContent());

        CashRegister<String> tipo2 = new CashRegister<>();
        tipo2.addMoney("Porta");
        System.out.println(tipo2.viewContent());

        //2- Criando métodos genérics
        System.out.println("Valor maior entre 25 e 40 é: " + getGreaterValue(25, 40));

        // 3 - bounded types
        Comparetor<Integer> comparadorInteiros = new Comparetor<>();

        System.out.println("Maior numero entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparetor<Double> comparadorInteiros2 = new Comparetor<>();

        System.out.println("Maior numero entre 1.95 e 4.55: " + comparadorInteiros2.obterMaior(1.95, 4.55));
    
        // Erro de compilação
        // Comparador<String> comparadorStrings = new Comparador<>();

    }

    public static<T extends Comparable<T>> T getGreaterValue( T value1, T value2) {
        return (value1.compareTo(value2) > 0) ? value1 : value2;
    }
}

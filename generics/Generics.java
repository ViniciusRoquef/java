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

    }

    public static<T extends Comparable<T>> T getGreaterValue( T value1, T value2) {
        return (value1.compareTo(value2) > 0) ? value1 : value2;
    }
}

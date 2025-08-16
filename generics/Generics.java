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

        // 4 - wildcard
        List<Integer> numeros2 = List.of(1, 2, 3);
        List<String> palavras2 = List.of("teste", "Java", "olá");

        // aceita qualquer tipo de lista (?)
        imprimirLista(numeros2);

        imprimirLista(palavras2);

        // aceita listas numericas (? extends Number)
        System.out.println(somarNumeros(numeros2));

        // somarNumeros(palavras2);

        // aceita apenas tipos numericos especificos
        // Number > Integer (5,4,3)
        List<Integer> numeros3 = new ArrayList<>();

        // adicionarNumeros aceita apenas Lista de Inteiros
        adicionarNumeros(numeros3);

        for(Integer numero : numeros3) {
            System.out.println(numero);
        }
    }

    public static<T extends Comparable<T>> T getGreaterValue( T value1, T value2) {
        return (value1.compareTo(value2) > 0) ? value1 : value2;
    }

    public static <K> void imprimirArray(K[] array) {
        for(K elemento : array) {
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista) {
        for(Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista) {
        double soma = 0;

        for(Number numero : lista) {
            soma += numero.doubleValue();
        }

        return soma;

    }

    public static void adicionarNumeros(List<? super Integer> lista) {

        for(int i = 1; i <= 5; i++) {
            lista.add(i);
        }

    }

}

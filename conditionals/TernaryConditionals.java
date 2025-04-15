package conditionals;

public class TernaryConditionals {

    public static void main(String[] args) {
        
        /* 
            *CONDICIONAIS TERNÁRIAS
            Condicionais ternárias são uma forma compacta de escrever uma estrutura condicional simples.
            A sintaxe é: condição ? valor_se_verdadeiro : valor_se_falso;
        */

        int number = 10;
        String result = (number % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número " + number + " é: " + result); 


        /*
         * PRECEDÊNCIA DE OPERADORES LÓGICOS
         * ordem em que os operadores lógicos ou de comparação são avaliados em uma expressão.
        
        (): Parênteses tem a maior ordem de prioridade em expressão;
        !: Operador NOT lógico tem a segunda maior precedência;
        &&: Operador AND lógico é avaliado antes do ||;
        ||: o operador || OR lógico é analisando por último em uma expressão;

        obs: compreeender a precedência evitar erros lógicos em uma expressão.
         */

        boolean a = true;
        boolean b = false;
        boolean c = true;

        // true && false -> false || true -> true
        boolean expression = a && b || c;

        // true || false -> true && true -> true
        boolean expression2 = a || b && (c);
        System.out.println(expression2);

        // !(false && true) -> true || true -> true
        boolean expression3 = a || !(b && c);
        System.out.println(expression3);
    }
}
package generics;

public class Comparetor<T extends Number>  {

    public T obterMaior(T numero1, T numero2) {

        // >
        if(numero1.doubleValue() > numero2.doubleValue()) {
            return numero1;
        } else {
            return numero2;
        }

    }
}

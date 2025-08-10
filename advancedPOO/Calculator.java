package advancedPOO;

interface Calculator {
    
    int sum(int a, int b);

    //pode ser usado sem implementação
    default int multiply(int a, int b) {
        return a * b;
    }
}

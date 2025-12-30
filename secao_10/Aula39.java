// Promoções Automáticas - Parte 2

// byte, short e char são promovidos quando usados em uma expressão

public class Aula39 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a + 5; // a é promovido para int antes do cálculo (caso a variável b seja declarada como byte, retornará erro)
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);

        int c = 10;
        float d = 1.5f;
        float e = c * d; // c é promovido para float antes do cálculo
        System.out.println("Valor de e = " + e);

        int f = 20;
        float g = 1.5f;
        float h = f * g; // f é promovido para double antes do cálculo
        System.out.println("Valor de h = " + h);
    }
}

// Promoções Automáticas - Parte 1

// byte, short e char são promovidos quando usados em uma expressão

public class Aula38 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a + 5; // a é promovido para int antes do cálculo

        int c = 10;
        long d = 15L;
        long e = c + d; // c é promovido para long antes do cálculo
        
        int f = 10;
        float g = 1.5f;
        float h = f * g; // f é promovido para float antes do cálculo

        String i = "Jefferson"; // tipo String

        // Imprime o tipo da b
        System.out.println("O tipo de 'b' é: " + ((Object) b).getClass());

        // Imprime o tipo da e
        System.out.println("O tipo de 'e' é: " + ((Object) e).getClass());

        // Imprime o tipo da variável h
        System.out.println("O tipo de 'h' é: " + ((Object) h).getClass());

        // Imprime o tipo da variável i
        System.out.println("O tipo de 'i' é: " + i.getClass());
    }
}

// Inferência de Tipo de Variável Local - var

// var foi intruduzido no Java 10
// Declarar uma variável local
// Faz inferência de valor

public class Aula40 {
    public static void main(String[] args) {
        var numero = 10.5D; // inferência double
        //float numero2 = numero; // irá retornar erro, pois float é menor do que double
        double numero2 = numero;

        System.out.println("Valor de numero = " + numero);
        System.out.println("Valor de numero2 = " + numero2);

        // var usuario = new Usuario(); // inferência do tipo Usuario
    }
}

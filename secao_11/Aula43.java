// Identificadores (variáveis)

/**
 * 1. Caracteres permitidos: Letras (a-z ou A-Z), dígitos (0-9), sublinhados (_) ou cifrões ($). Não pode começar com dígito.
 * 2. Sensível a maiúsculas e minúsculas: nome e Nome são diferentes.
 * 3. Palavras reservadas: Palavras como int, class, public, etc. não podem ser usados como identificadores.
 * 4. Sem limite de comprimento: No entando, é melhor manter os nomes curtos e significativos.
 */

/**
 * Exemplos de identificadores válidos:
 * nome
 * idade
 * salárioAnual
 * _temp
 * $id
 * 
 * Exemplos de identificadores inválidos:
 * 123abc // começa com um dígito
 * a-b // contém um caractere inválido
 * class / é uma palavra resrvada
 */

public class Aula43 {
    public static void main(String[] args) {
        /* 
        var Numero = 10.5D;
        System.out.println("Valor de numero = " + numero );
        Irá retornar erro!
        */

        var numero = 10.5D;
        System.out.println("Valor de numero = " + numero );

    }
}

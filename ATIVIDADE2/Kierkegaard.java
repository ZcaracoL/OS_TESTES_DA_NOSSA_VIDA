
package com.exemplo;

public class Kierkegaard {
private static final String QUOTE = "O IMPORTANTE E O CAMINHO QUE VOCE VAI TRILHAR DAQUI PARA FRENTE";
    public static String extract(int n) {
        if (n < 0 || n > QUOTE.length()) throw new IllegalArgumentException();
        return QUOTE.substring(0, n);
    }
}

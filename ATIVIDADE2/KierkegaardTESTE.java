package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KierkegaardTESTE {

    @Test
    public void cortaCertoNoComeco() {
        assertEquals("O IMPORTANTE E O CAMINHO", Kierkegaard.extract(25));
    }

    @Test
    public void quandoPedeAFraseInteira() {
        String fraseCompleta = "O IMPORTANTE E O CAMINHO QUE VOCE VAI CORRER, TIPO O SONIC";
        assertEquals(fraseCompleta, Kierkegaard.extract(fraseCompleta.length()));
    }

    @Test
    public void lancaErroSeForNegativoOuGrandeDemais() {
        assertThrows(IllegalArgumentException.class, () -> Kierkegaard.extract(-1));
        assertThrows(IllegalArgumentException.class, () -> Kierkegaard.extract(999));
    }
}
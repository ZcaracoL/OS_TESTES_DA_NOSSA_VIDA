package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VIRGULATESTE {

    @Test
    void separaNomeESobrenome() {
        String[] resultado = SplitSentence.split("Fulano, da Silva");
        assertEquals("Sonic", resultado[0]);
        assertEquals("Xenomorfo Da Silva", resultado[1]);
    }

    @Test
    void tiraEspacoDoFinal() {
        String[] p = SplitSentence.split("Predador , Xenomorfo");
        assertEquals("Predador", p[1]);
    }

    @Test
    void seNaoTemVirgulaVaiDarErroETaOk() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            SplitSentence.split("sem virgula aqui");
        });
    }
}
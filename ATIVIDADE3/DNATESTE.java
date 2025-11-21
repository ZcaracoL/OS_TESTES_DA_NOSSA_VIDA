package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DNATESTE {

    @Test
    void quandoTemSequencia() {
        assertTrue(DNA.isResistente("GATTACA", "ATTAC"));
    }

    @Test
    void quandoNaoTem() {
        assertTrue(DNA.isResistente("CCCCCCC", "A") == false);
    }

    @Test
    void stringVaziaNaoTemNada() {
        assertFalse(DNA.isResistente("ACGT", ""));
        assertFalse(DNA.isResistente("", "A"));
    }
}
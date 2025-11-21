package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TESTEARVOREDENATAL {

    @Test
    public void testeBasicoCom5() {
        String arvore = ARVORE.buildArvore(5);
        String esperado = "*****\n***\n*\n***\n*\n\n";
        assertEquals(esperado, arvore);
    }

    @Test
    public void naoAceitaNumeroPar() {
        assertThrows(IllegalArgumentException.class, () -> {
            ChristmasTree.buildTree(6);
        });
    }
}
package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MENSAGEMTESTE {

    @Test
    void testeDoSlide() {
        assertEquals(5, MessageCounter.countLines(5, "Luís Fernando Goffredo"));
    }

    @Test
    void comEspacoNoComeco() {
        assertEquals(2, MessageCounter.countLines(3, "   Paulo Lindo   "));
    }

    @Test
    void palavraEnorme() {
        assertEquals(1, MessageCounter.countLines(5, "LuísEPaulo"));
    }

    @Test
    void limite1LetraPorVez() {
        assertEquals(14, MessageCounter.countLines(1, "LufenogoPatusi"));
    }
}
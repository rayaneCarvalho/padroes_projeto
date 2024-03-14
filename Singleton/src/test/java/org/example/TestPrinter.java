package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPrinter {

    @Test
    public void deveRetornarQtePagina() {
        Printer.getInstance().setNumeroDePagina(10);
        assertEquals(10, Printer.getInstance().getNumeroDePagina());
    }

}
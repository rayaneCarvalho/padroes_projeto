package org.example;

public class Printer {

    private Printer() {};
    private static Printer instance = new Printer();
    public static Printer getInstance() {
        return instance;
    }

    private int numeroDePaginas;

    public int getNumeroDePagina() {
        return numeroDePaginas;
    }

    public void setNumeroDePagina(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}

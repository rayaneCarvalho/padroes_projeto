package org.example;

public class TemplateEstrangeiro implements TemplateAbstrato{
    @Override
    public CompraVenda createCompraVenda() {
        return new CompraVendaEstrangeiro();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoEstrangeiro();
    }
}

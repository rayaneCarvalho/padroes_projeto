package org.example;

public class Cliente {
    private CompraVenda compraVenda;
    private Procuracao procuracao;

    public Cliente (TemplateAbstrato template) {
        this.compraVenda = template.createCompraVenda();
        this.procuracao = template.createProcuracao();
    }

    public String emitirCompraVenda() {
        return this.compraVenda.emitir();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
}

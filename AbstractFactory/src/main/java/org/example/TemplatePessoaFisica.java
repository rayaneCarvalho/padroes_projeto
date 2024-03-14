package org.example;

public class TemplatePessoaFisica implements TemplateAbstrato{

    @Override
    public CompraVenda createCompraVenda() {
        return new CompraVendaPessoaFisica();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPessoaFisica();
    }
}

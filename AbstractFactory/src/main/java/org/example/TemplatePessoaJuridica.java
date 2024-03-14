package org.example;

public class TemplatePessoaJuridica implements TemplateAbstrato{

    @Override
    public CompraVenda createCompraVenda() {
        return new CompraVendaPessoaJuridica();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPessoaJuridica();
    }
}

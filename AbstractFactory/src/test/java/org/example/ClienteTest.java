package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        TemplateAbstrato template = new TemplatePessoaFisica();
        Cliente cliente = new Cliente(template);
        assertEquals("Procuração Pessoa Fisica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        TemplateAbstrato template = new TemplatePessoaJuridica();
        Cliente cliente = new Cliente(template);
        assertEquals("Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoEstrangeiro() {
        TemplateAbstrato template = new TemplateEstrangeiro();
        Cliente cliente = new Cliente(template);
        assertEquals("Procuração Estrangeiro", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirCompraVendaPessoaFisica() {
        TemplateAbstrato template = new TemplatePessoaFisica();
        Cliente cliente = new Cliente(template);
        assertEquals("Contrato de Compra e Venda Pessoa Física", cliente.emitirCompraVenda());
    }

    @Test
    void deveEmitirCompraVendaPessoaJuridica() {
        TemplateAbstrato template = new TemplatePessoaJuridica();
        Cliente cliente = new Cliente(template);
        assertEquals("Contrato de Compra e Venda Pessoa Jurídica", cliente.emitirCompraVenda());
    }

    @Test
    void deveEmitirComTemplateEstrangeiro() {
        TemplateAbstrato template = new TemplateEstrangeiro();
        Cliente cliente = new Cliente(template);
        assertEquals("Contrato de Compra e Venda Estrangeiro", cliente.emitirCompraVenda());
    }



}
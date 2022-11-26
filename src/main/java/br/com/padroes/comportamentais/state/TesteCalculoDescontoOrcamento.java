package br.com.padroes.comportamentais.state;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;
import br.com.padroes.exception.DomainException;

public class TesteCalculoDescontoOrcamento {

	@Test
	public void deveValidarValorDescontoEmAnalise() {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 3);
		orcamento.aplicarDescontoExtra();
		Assert.assertEquals(new BigDecimal("950.00"), orcamento.getValor());
	}
	
	@Test
	public void deveValidarValorDescontoAprovado() {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 3);
		orcamento.aprovar();
		orcamento.aplicarDescontoExtra();
		Assert.assertEquals(new BigDecimal("980.00"), orcamento.getValor());
	}
	
	@Test(expected = DomainException.class)
	public void deveValidarValorExceptionAoFinalizar() {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 3);
		orcamento.finalizar();
	}
	
	@Test
	public void deveValidarValorOrcamentoSemAplicarDescontoExtra() {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 3);
		orcamento.aprovar();
		orcamento.finalizar();
		orcamento.aplicarDescontoExtra();
		Assert.assertEquals(new BigDecimal("1000"), orcamento.getValor());
	}
}

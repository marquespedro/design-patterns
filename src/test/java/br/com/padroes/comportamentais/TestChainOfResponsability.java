package br.com.padroes.comportamentais;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.CalculadoraDescontos;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

public class TestChainOfResponsability {

	private Orcamento orcamento;

	@Test
	public void deveValidarTodosDescontos() {
		orcamento = new Orcamento(new BigDecimal(2000), 6);
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		calculadora.calcular(orcamento);
		assertEquals(BigDecimal.valueOf((1840)), orcamento.getValor());
	}
	
	@Test
	public void deveValidarDescontoValor() {
		orcamento = new Orcamento(new BigDecimal(6000), 5);
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		calculadora.calcular(orcamento);
		assertEquals(BigDecimal.valueOf((5820)), orcamento.getValor());
	}
}
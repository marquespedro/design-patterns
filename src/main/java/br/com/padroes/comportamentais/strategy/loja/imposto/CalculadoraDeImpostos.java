package br.com.padroes.comportamentais.strategy.loja.imposto;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	private Imposto imposto;
	
	public CalculadoraDeImpostos (Imposto imposto) {
		this.imposto = imposto;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		return imposto.calcular(orcamento);
	}
}

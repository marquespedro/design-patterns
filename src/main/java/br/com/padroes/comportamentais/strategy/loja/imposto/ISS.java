package br.com.padroes.comportamentais.strategy.loja.imposto;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {	
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}

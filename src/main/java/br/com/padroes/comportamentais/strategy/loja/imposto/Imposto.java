package br.com.padroes.comportamentais.strategy.loja.imposto;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

public interface Imposto {

	public BigDecimal calcular(Orcamento orcamento);
}

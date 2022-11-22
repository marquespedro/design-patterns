package br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.Desconto;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine
 * Chain of Responsabilty 
 * Representa uma regra da cadeia
 */
public class DescontoComValorMaiorQuinhentos extends Desconto {

	public DescontoComValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean atendeRegraDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
}

package br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.Desconto;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine
 * Chain of Responsabilty 
 * Representa uma regra da cadeia 
 * Esta em especifico delimita o fim da cadeia
 */
public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);		
	}

	@Override
	public boolean atendeRegraDesconto(Orcamento orcamento) {
		return Boolean.TRUE;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}

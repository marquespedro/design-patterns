package br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.Desconto;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine
 * Chain of Responsabilty 
 * Representa uma regra da cadeia 
 * Esta em especifico delimita o fim da cadeia
 */
public class FimDescontos extends Desconto {

	public FimDescontos() {
		super(null);		
	}

	@Override
	public boolean atendeRegraDesconto(Orcamento orcamento) {
		return Boolean.TRUE;
	}

	@Override
	public void aplicarDesconto(Orcamento orcamento) {
		
	}

}

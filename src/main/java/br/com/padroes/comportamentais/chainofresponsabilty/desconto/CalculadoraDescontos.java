package br.com.padroes.comportamentais.chainofresponsabilty.desconto;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain.DescontoComMaisCincoItens;
import br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain.DescontoComValorMaiorQuinhentos;
import br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain.SemDesconto;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine
 * Chain of Responsabilty
 */
public class CalculadoraDescontos {

	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto descontos = new DescontoComMaisCincoItens(
								new DescontoComValorMaiorQuinhentos(
									new SemDesconto()));
			
		return descontos.calcular(orcamento);
	}
}

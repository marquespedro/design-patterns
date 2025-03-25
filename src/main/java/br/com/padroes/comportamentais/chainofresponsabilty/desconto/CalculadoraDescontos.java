package br.com.padroes.comportamentais.chainofresponsabilty.desconto;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain.DescontoComMaisCincoItens;
import br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain.DescontoComValorMaiorQuinhentos;
import br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain.FimDescontos;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine Chain of Responsabilty
 */
public class CalculadoraDescontos {

	public void calcular(Orcamento orcamento) {

		Desconto descontos = new DescontoComMaisCincoItens(new DescontoComValorMaiorQuinhentos(new FimDescontos()));

		descontos.calcular(orcamento);
		
		orcamento.setValor(orcamento.getValor().subtract(orcamento.getDescontoAcumulado()));
	}
}

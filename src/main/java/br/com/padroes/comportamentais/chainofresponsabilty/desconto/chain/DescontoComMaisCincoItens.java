package br.com.padroes.comportamentais.chainofresponsabilty.desconto.chain;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.Desconto;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine Chain of Responsabilty Representa uma regra da cadeia
 */
public class DescontoComMaisCincoItens extends Desconto {

	private static final BigDecimal CINCO_POR_CENTO = BigDecimal.valueOf(5);
	
	public DescontoComMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	/**
	 * Tempalte Method o template do metodo e definido na classe Desconto metodo
	 * calcular
	 */
	@Override
	public boolean atendeRegraDesconto(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	/**
	 * Tempalte Method o template do metodo e definido na classe Desconto metodo
	 * calcular
	 */
	@Override
	public void aplicarDesconto(Orcamento orcamento) {
		BigDecimal valorDesconto = orcamento.getValor().divide(BigDecimal.valueOf(100)).multiply(CINCO_POR_CENTO);
		orcamento.acumularDesconto(valorDesconto);
	}

}

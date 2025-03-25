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

	private static final  BigDecimal TRES_POR_CENTO = BigDecimal.valueOf(3);
	
	public DescontoComValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean atendeRegraDesconto(Orcamento orcamento) {
		return orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0;
	}

	@Override
	public void aplicarDesconto(Orcamento orcamento) {
		BigDecimal valorDesconto = orcamento.getValor().divide(BigDecimal.valueOf(100)).multiply(TRES_POR_CENTO);
		orcamento.acumularDesconto(valorDesconto);
	}
}

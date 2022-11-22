package br.com.padroes.comportamentais.chainofresponsabilty.desconto;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * @author Machine Chain of Responsability
 * 
 *         Abstract pois a ideia nao e instanciar esta e sim as classes que
 *         fazem a corrente (chain) de responsabilidades/regras
 */
public abstract class Desconto {

	/**
	 * protected para ser acessado pelas classes filhas
	 */
	protected  Desconto proximo;

	public Desconto(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}
 
	/** 
	 * Template Method 
	 * Criação de um método concreto na classe “mãe”, que chama métodos abstratos implementados nas classes “filhas”
	 * O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
	 * @param orcamento
	 * @return 
	 */
	protected  BigDecimal calcular(Orcamento orcamento) {
		
		if(atendeRegraDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	public abstract boolean atendeRegraDesconto(Orcamento orcamento);
	
	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}

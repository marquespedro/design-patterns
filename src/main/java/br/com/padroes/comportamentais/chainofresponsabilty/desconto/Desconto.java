package br.com.padroes.comportamentais.chainofresponsabilty.desconto;

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
	protected Desconto proximo;

	protected Desconto(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}

	/**
	 * Template Method Criacao de um metodo concreto na classe mae, que chama
	 * metodos abstratos implementados nas classes filhas O padrao Template Method
	 * favorece o reaproveitamento de codigos comuns entre classes, evitando assim
	 * duplicacoes de codigos.
	 * 
	 * @param orcamento
	 * @return
	 */
	protected void calcular(Orcamento orcamento) {
		if (atendeRegraDesconto(orcamento)) {
			aplicarDesconto(orcamento);
		}
		if(proximo != null) {
			proximo.calcular(orcamento);
		}
	}

	public abstract boolean atendeRegraDesconto(Orcamento orcamento);

	public abstract void aplicarDesconto(Orcamento orcamento);
}

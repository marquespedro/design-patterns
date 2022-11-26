package br.com.padroes.comportamentais.state;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * Padrao State
 * @author 
 * Classe concreta que representa o estado Reprovado 
 * o mesmo so pode mudar o estado para finalizado, caso contrario uma exeception sera lancada.
 */
public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.mudarSituacao(new Finalizado());
	}
	

}

package br.com.padroes.comportamentais.state;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * Padrao State
 * @author 
 * Classe concreta que representa o estado Aprovado
 * O mesmo  sobrescreve os metodos  finalizar()   da classe SituacaoOrcamento
 * uma vez aprovado o mesmo so pode ser finalizado caso seja chamado algum outro metodo por ex aprovar
 * sera lancada uma exececao definida na classe mae SituacaoOrcamento
 */
public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.mudarSituacao(new Finalizado());
	}

}

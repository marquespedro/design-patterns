package br.com.padroes.comportamentais.state;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * Padrao State
 * @author 
 * Classe concreta que representa o estado EmAnalise
 * O mesmo  sobrescreve os metodos  calcularValorDescontoExtra(),aprovar() e reprovar() 
 * da classe SituacaoOrcamento
 */
public class EmAnalise extends  SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.mudarSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.mudarSituacao(new Reprovado());
	}
}

package br.com.padroes.comportamentais.strategy.loja.orcamento;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.state.EmAnalise;
import br.com.padroes.comportamentais.state.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void mudarSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	/**
	 * representa uma acao do padrao state
	 */
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	/**
	 * representa uma acao do padrao state
	 */
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	/**
	 * representa uma acao do padrao state
	 */
	public void finalizar() {
		this.situacao.finalizar(this);
	}

}

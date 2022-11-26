package br.com.padroes.comportamentais.state;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;
import br.com.padroes.exception.DomainException;

/**
 * @author 
 * 
 * Padrao State
 * Classe generica que abstrai a situacao de um orcamento 
 * bem como os estados que o mesmo pode assumir 
 */
public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser aprovado");
	}
		
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser reprovado");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser finalizado");
	}
}

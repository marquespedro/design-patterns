package br.gov.padroes.criacao.abstractFactory.factorys;

import br.gov.padroes.criacao.abstractFactory.emissor.EmissorMensagem;
import br.gov.padroes.criacao.abstractFactory.receptors.ReceptorMensagem;

public interface ComunicadorFactory {

	public static final int VISA = 1;
	public static final int MASTERCARD = 2;
	
	EmissorMensagem createEmissor();
	
	ReceptorMensagem createReceptor();
	
}

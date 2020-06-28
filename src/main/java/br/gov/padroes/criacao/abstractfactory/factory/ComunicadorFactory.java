package br.gov.padroes.criacao.abstractfactory.factory;

import br.gov.padroes.criacao.abstractfactory.emissores.EmissorMensagem;
import br.gov.padroes.criacao.abstractfactory.receptores.ReceptorMensagem;

public interface ComunicadorFactory {

	public static final int VISA = 1;
	public static final int MASTERCARD = 2;
	
	EmissorMensagem createEmissor();
	
	ReceptorMensagem createReceptor();
	
}

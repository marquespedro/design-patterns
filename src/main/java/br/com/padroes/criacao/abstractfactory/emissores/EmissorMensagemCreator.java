package br.com.padroes.criacao.abstractfactory.emissores;

import br.com.padroes.criacao.abstractfactory.factory.ComunicadorFactory;

public class EmissorMensagemCreator {

	public EmissorMensagem create(Integer tipo) {
		
		if (tipo == ComunicadorFactory.VISA) {
			return new EmissorMensagemVISA();
		}
		
		if (tipo == ComunicadorFactory.MASTERCARD) {
			return new EmissorMensagemMASTER();
		}
		
		throw new IllegalArgumentException("Tipo invalido ");
	}
}

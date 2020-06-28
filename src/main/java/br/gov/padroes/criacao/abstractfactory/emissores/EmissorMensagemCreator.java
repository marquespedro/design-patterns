package br.gov.padroes.criacao.abstractfactory.emissores;

import br.gov.padroes.criacao.abstractfactory.factory.ComunicadorFactory;

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

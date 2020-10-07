package br.com.padroes.criacao.abstractfactory.receptores;

import br.com.padroes.criacao.abstractfactory.factory.ComunicadorFactory;

public class ReceptorMensagemCreator {

	public ReceptorMensagem create(Integer tipo) {
		
		if (tipo == ComunicadorFactory.VISA) {
			return new ReceptorMensagemVISA();
		}
		
		if (tipo == ComunicadorFactory.MASTERCARD) {
			return new ReceptorMensagemMASTER();
		}
		
		throw new IllegalArgumentException("Tipo invalido ");
	}
}

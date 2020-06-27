package br.gov.padroes.criacao.abstractFactory.receptors;

import br.gov.padroes.criacao.abstractFactory.factorys.ComunicadorFactory;

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

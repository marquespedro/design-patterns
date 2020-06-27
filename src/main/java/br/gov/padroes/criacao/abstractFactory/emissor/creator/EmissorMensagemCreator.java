package br.gov.padroes.criacao.abstractFactory.emissor.creator;

import br.gov.padroes.criacao.abstractFactory.emissor.EmissorMensagem;
import br.gov.padroes.criacao.abstractFactory.emissor.EmissorMensagemMASTER;
import br.gov.padroes.criacao.abstractFactory.emissor.EmissorMensagemVISA;
import br.gov.padroes.criacao.abstractFactory.factorys.ComunicadorFactory;

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

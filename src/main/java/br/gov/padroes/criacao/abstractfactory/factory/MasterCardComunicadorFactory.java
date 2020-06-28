package br.gov.padroes.criacao.abstractfactory.factory;

import br.gov.padroes.criacao.abstractfactory.emissores.EmissorMensagem;
import br.gov.padroes.criacao.abstractfactory.emissores.EmissorMensagemCreator;
import br.gov.padroes.criacao.abstractfactory.receptores.ReceptorMensagem;
import br.gov.padroes.criacao.abstractfactory.receptores.ReceptorMensagemCreator;

public class MasterCardComunicadorFactory implements ComunicadorFactory {

	private EmissorMensagemCreator emissorCreator = new EmissorMensagemCreator();
	private ReceptorMensagemCreator receptorCreator = new ReceptorMensagemCreator();

	
	@Override
	public EmissorMensagem createEmissor() {
		return this.emissorCreator.create(ComunicadorFactory.MASTERCARD);
	}

	@Override
	public ReceptorMensagem createReceptor() {		
		return this.receptorCreator.create(ComunicadorFactory.MASTERCARD);
	}

}

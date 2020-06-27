package br.gov.padroes.criacao.abstractFactory.factorys;

import br.gov.padroes.criacao.abstractFactory.emissor.EmissorMensagem;
import br.gov.padroes.criacao.abstractFactory.emissor.creator.EmissorMensagemCreator;
import br.gov.padroes.criacao.abstractFactory.receptors.ReceptorMensagem;
import br.gov.padroes.criacao.abstractFactory.receptors.ReceptorMensagemCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {

	private EmissorMensagemCreator emissorCreator = new EmissorMensagemCreator();
	private ReceptorMensagemCreator receptorCreator = new ReceptorMensagemCreator();
	
	@Override
	public EmissorMensagem createEmissor() {
	
		return this.emissorCreator.create(ComunicadorFactory.VISA);
	}

	@Override
	public ReceptorMensagem createReceptor() {
		
		return this.receptorCreator.create(ComunicadorFactory.VISA);
	}

}
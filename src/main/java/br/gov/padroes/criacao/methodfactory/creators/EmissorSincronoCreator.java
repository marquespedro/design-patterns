package br.gov.padroes.criacao.methodfactory.creators;

import br.gov.padroes.criacao.methodfactory.emissor.Emissor;
import br.gov.padroes.criacao.methodfactory.emissor.EmissorSincronoEmail;

public class EmissorSincronoCreator extends EmissorCreator {

	@Override
	public Emissor create(int tipoDeEmissor) {

		if (tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorSincronoEmail();
		}

		throw new IllegalArgumentException(" Tipo de emissor não suportado ");
	}
}

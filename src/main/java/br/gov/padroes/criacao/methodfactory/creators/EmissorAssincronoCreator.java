package br.gov.padroes.criacao.methodfactory.creators;

import br.gov.padroes.criacao.methodfactory.emissor.Emissor;
import br.gov.padroes.criacao.methodfactory.emissor.EmissorAssincronoJMS;
import br.gov.padroes.criacao.methodfactory.emissor.EmissorAssincronoSMS;

/**
 * @author pedro
 * Representa uma outra especializacao de EmissorCreator onde é sobrescrito o metodo
 * de criacao de EmissorCreator
 */
public class EmissorAssincronoCreator extends EmissorCreator {

	@Override
	public Emissor create(int tipoDeEmissor) {
		
		if(tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorAssincronoSMS();
		}
				
		if(tipoDeEmissor == EmissorCreator.JMS) {
			return new EmissorAssincronoJMS();
		}
		
		throw new IllegalArgumentException ( " Tipo de emissor não suportado " ) ;
	}
}

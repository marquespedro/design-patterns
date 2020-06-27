package br.gov.padroes.criacao.methodfactory.creators;

import br.gov.padroes.criacao.methodfactory.Emissor;
import br.gov.padroes.criacao.methodfactory.EmissorEmail;
import br.gov.padroes.criacao.methodfactory.EmissorSMS;

/**
 * @author pedro
 * Representa a fabrica de criacao de Emissor 
 */
public class EmissorCreator {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor) {

		if (tipoDeEmissor == EmissorCreator.SMS) {

			return new EmissorSMS();

		} else if (tipoDeEmissor == EmissorCreator.EMAIL) {

			return new EmissorEmail();

		} else if (tipoDeEmissor == EmissorCreator.JMS) {

			return new EmissorJMS();

		} else {

			throw new IllegalArgumentException(" Tipo de emissor não suportado ");

		}
	}
}
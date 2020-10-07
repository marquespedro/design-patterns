package br.com.padroes.criacao.methodfactory.creator;

import br.com.padroes.criacao.Constante;
import br.com.padroes.criacao.methodfactory.emissor.Emissor;
import br.com.padroes.criacao.methodfactory.emissor.EmissorEmail;
import br.com.padroes.criacao.methodfactory.emissor.EmissorJMS;
import br.com.padroes.criacao.methodfactory.emissor.EmissorSMS;
import br.com.padroes.criacao.methodfactory.tipos.TipoEmissor;

/**
 * @author pedro
 * Creator Basico
 */
public class EmissorCreator {

	public Emissor create(TipoEmissor tipo) {

		switch (tipo) {
		case SMS:
			return new EmissorSMS();
		case JMS:
			return new EmissorJMS();
		case EMAIL:
			return new EmissorEmail();
		default:
			throw new IllegalArgumentException(Constante.TIPO_NAO_SUPORTADO);
		}

	}

}

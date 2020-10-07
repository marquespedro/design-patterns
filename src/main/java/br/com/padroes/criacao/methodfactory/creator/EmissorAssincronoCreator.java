package br.com.padroes.criacao.methodfactory.creator;

import br.com.padroes.criacao.Constante;
import br.com.padroes.criacao.methodfactory.emissor.Emissor;
import br.com.padroes.criacao.methodfactory.emissor.EmissorAssincronoJMS;
import br.com.padroes.criacao.methodfactory.emissor.EmissorAssincronoSMS;
import br.com.padroes.criacao.methodfactory.tipos.TipoEmissor;

/**
 * @author pedro
 * Outra especializacao de creator Assincrono
 */
public class EmissorAssincronoCreator extends EmissorCreator {

	@Override
	public Emissor create(TipoEmissor tipo) {

		if (TipoEmissor.SMS.equals(tipo)) {
			return new EmissorAssincronoSMS();
		}

		if (TipoEmissor.JMS.equals(tipo)) {
			return new EmissorAssincronoJMS();
		}

		throw new IllegalArgumentException(Constante.TIPO_NAO_SUPORTADO);
	}

}

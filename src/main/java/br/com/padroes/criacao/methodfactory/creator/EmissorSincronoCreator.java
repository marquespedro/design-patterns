package br.com.padroes.criacao.methodfactory.creator;

import br.com.padroes.criacao.Constante;
import br.com.padroes.criacao.methodfactory.emissor.Emissor;
import br.com.padroes.criacao.methodfactory.emissor.EmissorSincronoEmail;
import br.com.padroes.criacao.methodfactory.tipos.TipoEmissor;

/**
 * @author pedro
 * Outra especializacao de Creator Sincrono
 */
public class EmissorSincronoCreator extends EmissorCreator {

	@Override
	public Emissor create(TipoEmissor tipo) {

		if (TipoEmissor.EMAIL.equals(tipo)) {
			return new EmissorSincronoEmail();
		}
		
		throw new IllegalArgumentException(Constante.TIPO_NAO_SUPORTADO);
	}
}

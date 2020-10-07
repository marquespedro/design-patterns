package br.com.padroes.criacao.methodfactory;

import br.com.padroes.criacao.methodfactory.creator.EmissorAssincronoCreator;
import br.com.padroes.criacao.methodfactory.creator.EmissorCreator;
import br.com.padroes.criacao.methodfactory.emissor.Emissor;
import br.com.padroes.criacao.methodfactory.tipos.TipoEmissor;

/**
 * @author pedro
 * 
 * Este padrao se  Mehtod Factory basicamente é um metodo que retorna um tipo de objeto,  dado um contexto.
 *
 */
public class TestaMethodFactory {

	public static void main(String[] args) {
		
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor = creator.create(TipoEmissor.EMAIL);
		emissor.enviar("olá mundo ...");
		
		creator = new EmissorAssincronoCreator();
		emissor = creator.create(TipoEmissor.SMS);
		emissor.enviar("olá mundo ...");

	}

}

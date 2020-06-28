package br.gov.padroes.criacao.methodfactory;

import br.gov.padroes.criacao.methodfactory.creators.EmissorAssincronoCreator;
import br.gov.padroes.criacao.methodfactory.creators.EmissorCreator;
import br.gov.padroes.criacao.methodfactory.emissor.Emissor;

/**
 * @author pedro
 * 
 * O padrão Mehtod Factory basicamente é um metodo que retorna um tipo de objeto, 
 * dado um contexto.
 * 
 */
public class TestaMethodFactory {

	public static void main(String[] args) {
		
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor = creator.create(EmissorCreator.EMAIL);
		emissor.enviar("olá mundo ...");
		
		creator = new EmissorAssincronoCreator();
		emissor = creator.create(EmissorCreator.SMS);
		emissor.enviar("olá mundo ...");

	}

}

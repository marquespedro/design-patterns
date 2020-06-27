package br.gov.padroes.criacao.methodfactory;

import br.gov.padroes.criacao.methodfactory.creators.EmissorAssincronoCreator;
import br.gov.padroes.criacao.methodfactory.creators.EmissorCreator;

public class Testa {

	public static void main(String[] args) {
		
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor = creator.create(1);
		emissor.enviar("olá mundo ...");
		
		creator = new EmissorAssincronoCreator();
		emissor = creator.create(0);
		emissor.enviar("olá mundo ...");

	}

}

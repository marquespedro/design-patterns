package br.gov.padroes.criacao.abstractFactory;

import br.gov.padroes.criacao.abstractFactory.factorys.ComunicadorFactory;
import br.gov.padroes.criacao.abstractFactory.factorys.MasterCardComunicadorFactory;
import br.gov.padroes.criacao.abstractFactory.factorys.VisaComunicadorFactory;

public class TestaAbstractFactory {

	public static void main(String[] args) {
		
		ComunicadorFactory cf = new MasterCardComunicadorFactory();
		cf.createEmissor().enviar();
		cf.createReceptor().receber();
		
		cf = new VisaComunicadorFactory();
		cf.createEmissor().enviar();
		cf.createReceptor().receber();
	}

}

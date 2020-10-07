package br.com.padroes.criacao.abstractfactory;

import br.com.padroes.criacao.abstractfactory.factory.ComunicadorFactory;
import br.com.padroes.criacao.abstractfactory.factory.MasterCardComunicadorFactory;
import br.com.padroes.criacao.abstractfactory.factory.Pagamento;
import br.com.padroes.criacao.abstractfactory.factory.PagamentoCreator;
import br.com.padroes.criacao.abstractfactory.factory.VisaComunicadorFactory;


/**
 * @author pedro
 *
 * O padrão Abstract Factory basicamente é uma fabrica de fabricas, onde é preciso criar uma
 * serie de configuraçoes de varios objetos. 
 * No exemplo pode ser visto que existe uma fabrica de emissores e receptores para Master e Visa
 * Neste exemplo também foi combinado o padrão method factory com o qual construimos os receptors e emissor 
 *
 */
public class TestaAbstractFactory {

	public static void main(String[] args) {
		
		ComunicadorFactory cf = new MasterCardComunicadorFactory();
		PagamentoCreator pc = new PagamentoCreator();
		Pagamento p = pc.create(PagamentoCreator.CREDITO, ComunicadorFactory.VISA);
		
		cf.createEmissor().enviar();
		p.pagar(2.20);
		cf.createReceptor().receber();
		
		cf = new VisaComunicadorFactory();
		p = pc.create(PagamentoCreator.DEBITO, ComunicadorFactory.MASTERCARD);
		cf.createEmissor().enviar();
		p.pagar(3.40);
		cf.createReceptor().receber();
	}

}

package br.gov.padroes.criacao.methodfactory;

/**
 * @author pedro
 * Representa o tipo concreto de um emissor
 * 
 */
public class EmissorSincronoEmail implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor Sincrono Email : " + msg);
	}

}

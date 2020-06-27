package br.gov.padroes.criacao.methodfactory;

/**
 * @author pedro
 * Representa o tipo concreto de um emissor
 * 
 */
public class EmissorSMS  implements Emissor{

	public void enviar(String msg) {
		System.out.println("Emissor SMS : " + msg);
		
	}

}

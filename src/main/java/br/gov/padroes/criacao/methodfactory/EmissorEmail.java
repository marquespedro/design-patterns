package br.gov.padroes.criacao.methodfactory;

/**
 * @author pedro
 * Representa o tipo concreto de um emissor
 * 
 */
public class EmissorEmail implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor Email : " + msg);

	}

}

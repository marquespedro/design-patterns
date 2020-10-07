package br.com.padroes.criacao.methodfactory.emissor;

/**
 * @author pedro
 * Creator concreto
 */
public class EmissorSincronoEmail implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor Sincrono Email : " + msg);
	}

}

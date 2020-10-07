package br.com.padroes.criacao.methodfactory.emissor;

/**
 * @author pedro
 * Creator concreto
 */
public class EmissorSMS implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor SMS : " + msg);

	}

}

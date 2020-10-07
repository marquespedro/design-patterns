package br.com.padroes.criacao.methodfactory.emissor;

/**
 * @author pedro 
 * Creator concreto
 */
public class EmissorJMS implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor JMS : " + msg);
	}

}

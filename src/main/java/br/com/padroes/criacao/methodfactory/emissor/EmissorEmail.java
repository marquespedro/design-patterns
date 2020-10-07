package br.com.padroes.criacao.methodfactory.emissor;

/**
 * @author pedro
 * Creator concreto
 */
public class EmissorEmail implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor Email : " + msg);

	}

}

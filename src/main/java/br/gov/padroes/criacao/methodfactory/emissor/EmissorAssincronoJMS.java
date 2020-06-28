package br.gov.padroes.criacao.methodfactory.emissor;

public class EmissorAssincronoJMS implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor Assincrono JMS : " + msg);	}

}

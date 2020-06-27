package br.gov.padroes.criacao.methodfactory;

public class EmissorAssincronoSMS implements Emissor {

	public void enviar(String msg) {
		System.out.println("Emissor Assincrono SMS : " + msg);

	}

}

package br.gov.padroes.criacao.abstractFactory.receptors;

public class ReceptorMensagemMASTER implements ReceptorMensagem {

	@Override
	public String receber() {
		System.out.println("recebendo mensagem master card");
		return "recebendo mensagem master card";
	}



}

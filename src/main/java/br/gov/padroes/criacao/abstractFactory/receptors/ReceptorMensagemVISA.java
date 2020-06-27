package br.gov.padroes.criacao.abstractFactory.receptors;

public class ReceptorMensagemVISA implements ReceptorMensagem {

	@Override
	public String receber() {
		System.out.println("recebendo mensagem visa");
		return "recebendo mensagem visa";
	}



}

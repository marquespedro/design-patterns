package br.gov.padroes.criacao.abstractfactory.receptores;

public class ReceptorMensagemMASTER implements ReceptorMensagem {

	@Override
	public String receber() {
		System.out.println("Recebendo via receptor Master Card ....");
		return "recebendo mensagem master card";
	}



}

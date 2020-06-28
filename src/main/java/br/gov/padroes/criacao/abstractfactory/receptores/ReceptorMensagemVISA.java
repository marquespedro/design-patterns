package br.gov.padroes.criacao.abstractfactory.receptores;

public class ReceptorMensagemVISA implements ReceptorMensagem {

	@Override
	public String receber() {
		System.out.println("Recebendo via receptor visa ....");
		return "recebendo mensagem visa";
	}



}

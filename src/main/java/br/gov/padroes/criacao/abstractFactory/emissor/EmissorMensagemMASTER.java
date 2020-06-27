package br.gov.padroes.criacao.abstractFactory.emissor;

public class EmissorMensagemMASTER implements EmissorMensagem {

	@Override
	public String enviar() {
		System.out.println("enviando master card");
		return "enviando mensagem master card";
	}



}

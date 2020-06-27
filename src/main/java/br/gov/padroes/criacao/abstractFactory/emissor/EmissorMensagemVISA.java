package br.gov.padroes.criacao.abstractFactory.emissor;

public class EmissorMensagemVISA implements EmissorMensagem {

	@Override
	public String enviar() {
		System.out.println("enviando mensagem visa");
		return "enviando mensagem visa";
	}

}

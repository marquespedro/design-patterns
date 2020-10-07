package br.com.padroes.criacao.abstractfactory.emissores;

public class EmissorMensagemVISA implements EmissorMensagem {

	@Override
	public String enviar() {
		System.out.println("Enviando mensagem via emissor Visa");
		return "enviando mensagem visa";
	}

}

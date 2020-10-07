package br.com.padroes.criacao.abstractfactory.emissores;

public class EmissorMensagemMASTER implements EmissorMensagem {

	@Override
	public String enviar() {
		System.out.println("Enviando mensagem via emissor Master Card");
		return "enviando mensagem master card";
	}



}

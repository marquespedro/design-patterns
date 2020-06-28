package br.gov.padroes.criacao.methodfactory.emissor;


/**
 * @author pedro
 * Representa o tipo de emissor a ser criado
 * E assim garantir o polimorfismo
 */
public interface Emissor {

	void enviar(String msg);
	
}

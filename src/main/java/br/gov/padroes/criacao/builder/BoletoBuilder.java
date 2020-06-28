package br.gov.padroes.criacao.builder;

import java.util.Calendar;

/**
 * @author pedro
 *Interface que define os passos para a criação de um produto.
 */
public interface BoletoBuilder {

	void buildSacado(String sacado);

	void buildCedente(String cedente);

	void buildValor(double valor);

	void buildVencimento(Calendar vencimento);

	void buildNossoNumero(int nossoNumero);

	Boleto getBoleto();

}

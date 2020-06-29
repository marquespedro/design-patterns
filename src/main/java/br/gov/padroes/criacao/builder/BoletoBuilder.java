package br.gov.padroes.criacao.builder;

import java.util.Calendar;

import br.gov.padroes.criacao.builder.boleto.Boleto;

/**
 * @author pedro
 *Interface que define os passos para a criação de um objeto.
 */
public interface BoletoBuilder {

	void buildSacado(String sacado);

	void buildCedente(String cedente);

	void buildValor(double valor);

	void buildVencimento(Calendar vencimento);

	void buildNossoNumero(int nossoNumero);

	Boleto getBoleto();

}

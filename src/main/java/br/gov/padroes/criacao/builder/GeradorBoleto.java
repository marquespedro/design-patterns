package br.gov.padroes.criacao.builder;

import java.util.Calendar;

import br.gov.padroes.criacao.builder.boleto.Boleto;

/**
 * @author pedro
 *Aciona os método de um Builder para construir um produto.
 */
public class GeradorBoleto implements GerarBoleto {

	private BoletoBuilder builder;
	
	public GeradorBoleto (BoletoBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Boleto gerarBoleto() {
		
	
		this.builder.buildSacado("Fulano da Silva");
		this.builder.buildCedente("Condominio Jardim Brasil");
		this.builder.buildNossoNumero(1030);
		this.builder.buildValor(500.20);
		this.builder.buildVencimento(Calendar.getInstance());

	
		return this.builder.getBoleto();
	}
	
	
}

package br.com.padroes.criacao.builder.gerador;

import java.util.Calendar;

import br.com.padroes.criacao.builder.boleto.Boleto;
import br.com.padroes.criacao.builder.boleto.BoletoBuilder;
import br.com.padroes.criacao.builder.modelo.Pedido;

public class GeradorBoleto implements GerarBoleto {

	private BoletoBuilder builder;

	public GeradorBoleto(BoletoBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Boleto gerarBoleto(Pedido pedido) {

		this.builder.buildSacado(pedido.getCliente().getNome());
		this.builder.buildCedente(pedido.getCliente().getEndereco());
		this.builder.buildNossoNumero(1030);
		this.builder.buildValor(pedido.getValor());
		this.builder.buildVencimento(Calendar.getInstance());

		return this.builder.getBoleto();
	}

}

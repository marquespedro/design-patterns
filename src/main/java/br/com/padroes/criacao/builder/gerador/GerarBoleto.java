package br.com.padroes.criacao.builder.gerador;

import br.com.padroes.criacao.builder.boleto.Boleto;
import br.com.padroes.criacao.builder.modelo.Pedido;

public interface GerarBoleto {

	Boleto gerarBoleto(Pedido pedido);
}

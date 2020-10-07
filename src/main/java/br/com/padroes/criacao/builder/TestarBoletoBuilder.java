package br.com.padroes.criacao.builder;

import java.time.LocalDate;

import br.com.padroes.criacao.builder.bancobrasil.BancoBrasilBoletoBuilder;
import br.com.padroes.criacao.builder.boleto.Boleto;
import br.com.padroes.criacao.builder.boleto.BoletoBuilder;
import br.com.padroes.criacao.builder.gerador.GeradorBoleto;
import br.com.padroes.criacao.builder.itau.ItauBoletoBuilder;
import br.com.padroes.criacao.builder.modelo.Cliente;
import br.com.padroes.criacao.builder.modelo.Pedido;

public class TestarBoletoBuilder {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Pedro", "Taguatinga-DF");
		Cliente c2 = new Cliente("Nayara", "Brasilia-DF");
		
		Pedido p1 = new Pedido(200.50, LocalDate.now() , c1);
		Pedido p2 = new Pedido(100.20, LocalDate.now() , c2);
		
		BoletoBuilder boletoBuilder = new BancoBrasilBoletoBuilder();
		GeradorBoleto geradorDeBoleto = new GeradorBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.gerarBoleto(p1);
		System.out.println(boleto);
	
		
		boletoBuilder = new ItauBoletoBuilder();
		geradorDeBoleto = new GeradorBoleto(boletoBuilder);
		boleto = geradorDeBoleto.gerarBoleto(p2);
		System.out.println(boleto);
	
	}

}

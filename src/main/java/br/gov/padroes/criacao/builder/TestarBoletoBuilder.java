package br.gov.padroes.criacao.builder;

public class TestarBoletoBuilder {

	public static void main(String[] args) {
		
		BoletoBuilder boletoBuilder = new BancoBrasilBoletoBuilder();
		GeradorBoleto geradorDeBoleto = new GeradorBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.gerarBoleto();
		System.out.println(boleto);
	
		
		boletoBuilder = new ItauBoletoBuilder();
		geradorDeBoleto = new GeradorBoleto(boletoBuilder);
		boleto = geradorDeBoleto.gerarBoleto();
		System.out.println(boleto);
	
	}

}

package br.gov.padroes.criacao.abstractfactory.factory;

public class PagamentoCreator {
	
	public static final int DEBITO = 1;
	public static final int CREDITO = 2;
	
	
	public Pagamento create(Integer tipoPagamento, Integer codigoBandeiraCartao) {
		
		if (tipoPagamento == DEBITO && codigoBandeiraCartao == ComunicadorFactory.VISA) {
			return new PagamentoDebitoVisa();
		}
		
		if (tipoPagamento == CREDITO && codigoBandeiraCartao == ComunicadorFactory.VISA) {
			return new PagamentoCreditoVisa();
		}
		
		if (tipoPagamento == DEBITO && codigoBandeiraCartao == ComunicadorFactory.MASTERCARD) {
			return new PagamentoDebitoMaster();
		}
		
		if (tipoPagamento == CREDITO && codigoBandeiraCartao == ComunicadorFactory.MASTERCARD) {
			return new PagamentoCreditoMaster();
		}
		
		throw new IllegalArgumentException("Tipo pagamento invalido ");
	}
}

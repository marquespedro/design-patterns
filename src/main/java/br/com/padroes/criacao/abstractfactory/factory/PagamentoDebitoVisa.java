package br.com.padroes.criacao.abstractfactory.factory;

public class PagamentoDebitoVisa implements Pagamento {

	@Override
	public void pagar(Double valor) {
		System.out.println("Pagamento debito visa..." + valor);
	}

}

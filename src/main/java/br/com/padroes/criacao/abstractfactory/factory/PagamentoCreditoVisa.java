package br.com.padroes.criacao.abstractfactory.factory;

public class PagamentoCreditoVisa implements Pagamento {

	@Override
	public void pagar(Double valor) {
		System.out.println("Pagamento cred visa..." + valor);

	}

}

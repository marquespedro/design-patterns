package br.com.padroes.criacao.abstractfactory.factory;

public class PagamentoDebitoMaster implements Pagamento {

	@Override
	public void pagar(Double valor) {
		System.out.println("Pagamento cred visa..." + valor);
	}

}

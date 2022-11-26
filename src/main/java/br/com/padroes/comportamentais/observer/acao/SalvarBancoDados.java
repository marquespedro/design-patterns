package br.com.padroes.comportamentais.observer.acao;

import br.com.padroes.comportamentais.observer.AcaoAposGerarPedido;
import br.com.padroes.comportamentais.strategy.loja.pedido.Pedido;

/**
 * Um observer que está olhando para a acao de salvar no banco 
 * @author Machine
 * 
 */
public class SalvarBancoDados implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando  pedido banco dados");
	}

}

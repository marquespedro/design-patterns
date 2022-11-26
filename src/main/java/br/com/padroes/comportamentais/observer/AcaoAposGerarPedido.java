package br.com.padroes.comportamentais.observer;

import br.com.padroes.comportamentais.strategy.loja.pedido.Pedido;

public interface AcaoAposGerarPedido {
	
	void executarAcao(Pedido pedido);

}

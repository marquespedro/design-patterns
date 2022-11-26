package br.com.padroes.comportamentais.command;

import java.time.LocalDateTime;
import java.util.List;

import br.com.padroes.comportamentais.observer.AcaoAposGerarPedido;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;
import br.com.padroes.comportamentais.strategy.loja.pedido.Pedido;

/**
 * Command Handler Padrao  e Padrao Observer
 * @author Machine
 * 
 * GeraPedidoHandler executa as acoes que sao passada via construtor (Publisher) 
 */
public class GeraPedidoHandler {

	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler (List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		acoes.forEach(a -> a.executarAcao(pedido));
	}
	
}

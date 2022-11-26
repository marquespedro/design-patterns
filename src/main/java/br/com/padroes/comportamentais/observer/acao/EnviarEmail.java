package br.com.padroes.comportamentais.observer.acao;

import br.com.padroes.comportamentais.observer.AcaoAposGerarPedido;
import br.com.padroes.comportamentais.strategy.loja.pedido.Pedido;

/**
 * Um Observer que está olhando para a acao de enviar email 
 * @author Machine
 * 
 */
public class EnviarEmail implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email ...");		
	}

}

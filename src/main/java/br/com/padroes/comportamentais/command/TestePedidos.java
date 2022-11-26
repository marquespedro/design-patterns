package br.com.padroes.comportamentais.command;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import br.com.padroes.comportamentais.observer.acao.EnviarEmail;
import br.com.padroes.comportamentais.observer.acao.SalvarBancoDados;

public class TestePedidos {

	
	@Test
	public void teste() {
		String cliente = "Pedro";
		BigDecimal valorOrcamento = new BigDecimal("1000");
		int quantidadeItens = 10;
		
		GeraPedido gerarPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarBancoDados(), new EnviarEmail()));
		handler.executar(gerarPedido);
	}

}

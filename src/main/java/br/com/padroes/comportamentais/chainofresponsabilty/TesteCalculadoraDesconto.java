package br.com.padroes.comportamentais.chainofresponsabilty;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.chainofresponsabilty.desconto.CalculadoraDescontos;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

/**
 * https://refactoring.guru/design-patterns/chain-of-responsibility
 * 
 * @author Machine
 * Chain of Responsability 
 * Diferente do padrao strategy aqui a regra de desconto que é aplicada é descoberta dinamicamente
 * percorrendo a cadeia de regras/responsabilidade
 * 
 * A regra é descoberta na execucao da cadeia de regras de desconto.
 */
public class TesteCalculadoraDesconto {

	public static void main(String[] args) {
		Orcamento descontoPorItens = new Orcamento(new BigDecimal(2000), 6);
		Orcamento descontoPorValorOrcamento = new Orcamento(new BigDecimal(1000), 2);
		Orcamento semDesconto = new Orcamento(new BigDecimal(200), 2);

		CalculadoraDescontos calculadora = new CalculadoraDescontos();

		System.out.println("DESCONTO  POR QTD ITENS: " + calculadora.calcular(descontoPorItens));
		System.out.println("DESCONTO POR VALOR PEDIDO: " + calculadora.calcular(descontoPorValorOrcamento));
		System.out.println("DESCONTO ZERO: " + calculadora.calcular(semDesconto));

	}
}

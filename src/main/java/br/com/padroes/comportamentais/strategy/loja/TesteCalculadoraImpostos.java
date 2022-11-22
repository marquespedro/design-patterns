package br.com.padroes.comportamentais.strategy.loja;

import java.math.BigDecimal;

import br.com.padroes.comportamentais.strategy.loja.imposto.CalculadoraDeImpostos;
import br.com.padroes.comportamentais.strategy.loja.imposto.ICMS;
import br.com.padroes.comportamentais.strategy.loja.imposto.ISS;
import br.com.padroes.comportamentais.strategy.loja.orcamento.Orcamento;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal(2000), 4);

		System.out.println("VALOR ICMS : " + new CalculadoraDeImpostos(new ICMS()).calcular(orcamento));

		System.out.println("VALOR ISS " + new CalculadoraDeImpostos(new ISS()).calcular(orcamento));
	}

}

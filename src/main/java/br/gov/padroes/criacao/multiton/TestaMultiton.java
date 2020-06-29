package br.gov.padroes.criacao.multiton;

/**
 * @author pedro
 * Ao contrario do singleton , este padrao multiton limita a quantidades de instanciaas
 * de uma determinada classe
 */
public class TestaMultiton {

	public static void main(String[] args) {
		
		Tema t1 = Tema.getInstancia(Tema.FIRE);
		System.out.println(t1.toString());
		
		Tema t2 = Tema.getInstancia(Tema.SKY);
		System.out.println(t2.toString());

	}

}

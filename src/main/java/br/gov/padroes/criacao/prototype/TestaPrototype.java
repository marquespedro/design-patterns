package br.gov.padroes.criacao.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * @author pedro
 * Prototype é um padrao onde é criado um objeto a partir da copia de outro
 * afim de reaproveitar informacoes
 */
public class TestaPrototype {

	public static void main(String[] args) {
		
		String nome = "Protype Teste";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> palavrasChaves = new HashSet<>();
		palavrasChaves.add("teste a");
		palavrasChaves.add("teste b");
		
		CampanhaPublicitaria c = new CampanhaPublicitaria(nome, vencimento, palavrasChaves);
		System.out.println(c.toString());
		
		CampanhaPublicitaria clone = c.clonar();
		System.out.println(clone.toString());

	}

}

package br.gov.padroes.criacao.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class CampanhaPublicitaria implements Prototype<CampanhaPublicitaria> {

	private String nome;
	private Calendar vencimento;
	private Set<String> palavrasChaves;

	public CampanhaPublicitaria(String nome, Calendar vencimento, Set<String> palavrasChaves) {
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChaves = palavrasChaves;
	}

	@Override
	public CampanhaPublicitaria clonar() {
		String nome = "Copia " + this.nome;
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set<String> palavrasChaves = new HashSet<String>(this.palavrasChaves);
		CampanhaPublicitaria c = new CampanhaPublicitaria(nome, vencimento, palavrasChaves);
		return c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public Set<String> getPalavrasChaves() {
		return palavrasChaves;
	}

	public void setPalavrasChaves(Set<String> palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
	}

	@Override
	public String toString() {
		return "CampanhaPublicitaria [nome=" + nome + ", vencimento=" + vencimento + ", palavrasChaves="
				+ palavrasChaves + "]";
	}

	
}

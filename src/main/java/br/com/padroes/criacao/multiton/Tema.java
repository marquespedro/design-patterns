package br.com.padroes.criacao.multiton;

import java.util.HashMap;
import java.util.Map;

public class Tema {

	private String nome;
	private String corFundo;
	private String corFonte;
	
	public static final String SKY = "Sky";
	public static final String FIRE = "Fire";
	
	private static Map<String, Tema> temas = new HashMap<>();
	
	static {
		
		Tema tema1 = new Tema();
		tema1.setNome(SKY);
		tema1.setCorFonte("Azul");
		tema1.setCorFundo("Preto");
		
		Tema tema2 = new Tema();
		tema2.setNome(FIRE);
		tema2.setCorFonte("Verde");
		tema2.setCorFundo("Cinza");
		
		temas.put(SKY, tema1);
		temas.put(FIRE, tema2);
		
	}
	
	/**
	 * Bloqueia usuario de instanciar outros temas
	 */
	private Tema() {
		
	}

	public static Tema getInstancia(String key) {
		return Tema.temas.get(key);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(String corFundo) {
		this.corFundo = corFundo;
	}

	public String getCorFonte() {
		return corFonte;
	}

	public void setCorFonte(String corFonte) {
		this.corFonte = corFonte;
	}

	@Override
	public String toString() {
		return "Tema [nome=" + nome + ", corFundo=" + corFundo + ", corFonte=" + corFonte + "]";
	}
	
	
}

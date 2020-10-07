package br.com.padroes.criacao.builder.modelo;

public class Cliente {

	private String nome;
	private String endereco;

	public Cliente(String nome, String endereco) {
		this.endereco = endereco;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

}

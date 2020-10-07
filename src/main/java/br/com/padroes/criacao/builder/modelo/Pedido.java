package br.com.padroes.criacao.builder.modelo;

import java.time.LocalDate;

public class Pedido {

	private double valor;
	private LocalDate data;
	private Cliente cliente;

	public Pedido (double valor, LocalDate data, Cliente cliente) {
		this.valor = valor;
		this.data = data;
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}

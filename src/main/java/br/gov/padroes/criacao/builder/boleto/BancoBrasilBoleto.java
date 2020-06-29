package br.gov.padroes.criacao.builder.boleto;

import java.util.Calendar;

public class BancoBrasilBoleto implements Boleto {

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;

	public BancoBrasilBoleto(String sacado, 
							String cedente, 
							double valor, 
							Calendar vencimento, 
							int nossoNumero) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	public String getSacado() {
		return sacado;
	}

	public void setSacado(String sacado) {
		this.sacado = sacado;
	}

	public String getCedente() {
		return cedente;
	}

	public void setCedente(String cedente) {
		this.cedente = cedente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public int getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	@Override
	public String toString() {
		return "BancoBrasilBoleto [sacado=" + sacado + ", cedente=" + cedente + ", valor=" + valor + ", vencimento="
				+ vencimento + ", nossoNumero=" + nossoNumero + "]";
	}
	
	
	
}

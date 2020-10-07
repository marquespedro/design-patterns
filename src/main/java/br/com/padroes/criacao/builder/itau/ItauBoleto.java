package br.com.padroes.criacao.builder.itau;

import java.util.Calendar;

import br.com.padroes.criacao.builder.boleto.Boleto;

public class ItauBoleto implements Boleto {

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;

	public ItauBoleto(String sacado, 
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
		return "Itau Boleto [sacado=" + sacado + ", cedente=" + cedente + ", valor=" + valor + ", vencimento="
				+ vencimento + ", nossoNumero=" + nossoNumero + "]";
	}
	
	
	
}

package br.com.padroes.exception;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException (String msg) {
		super(msg);
	}
}

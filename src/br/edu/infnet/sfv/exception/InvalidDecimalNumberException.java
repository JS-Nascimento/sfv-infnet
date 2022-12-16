package br.edu.infnet.sfv.exception;

public class InvalidDecimalNumberException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidDecimalNumberException() {
		super("Preencha corretamente o número decimal");
	}
	
}

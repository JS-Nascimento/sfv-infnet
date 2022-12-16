package br.edu.infnet.sfv.exception;

public class InvalidEmailException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidEmailException() {
		super("Preencha corretamente o email");
	}
	
}

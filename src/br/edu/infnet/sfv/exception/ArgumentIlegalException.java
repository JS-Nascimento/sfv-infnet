package br.edu.infnet.sfv.exception;

public class ArgumentIlegalException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ArgumentIlegalException(Object object, String mensagem ) {
		super(object.getClass() + " - " + mensagem);
	}
	
}

package br.edu.infnet.sfv.enums;

public enum TipoParceiro {
	
	VENDEDOR(1, "Vendedor"),
	GERENTE(2, "Gerente"),
	FORNECEDOR(3, "Fornecedor");
	
	private Integer id;
	private String tipo;
	
	
	
	private TipoParceiro(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	

	public Integer getId() {
		return id;
	}



	public String getTipo() {
		return tipo;
	}



	public static String toEnum(Integer id) {
		
		if(id == null) {
			return null;
		}
		
		for (TipoParceiro ct : TipoParceiro.values()) {
			if (id.equals(ct.getId())) {
				return ct.tipo;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado.");
		
	}


}

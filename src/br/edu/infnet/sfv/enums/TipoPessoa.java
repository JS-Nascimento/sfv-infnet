package br.edu.infnet.sfv.enums;

public enum TipoPessoa {
	
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private Integer id;
	private String tipo;
	
	
	
	private TipoPessoa(Integer id, String tipo) {
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
		
		for (TipoPessoa ct : TipoPessoa.values()) {
			if (id.equals(ct.getId())) {
				return ct.tipo;
			}
		}
		throw new IllegalArgumentException("Tipo não encontrado.");
		
	}

}

package br.edu.infnet.sfv.model.entity;

import br.edu.infnet.sfv.enums.TipoPessoa;

public class Cliente {
	
	private String nome;
	private Integer tipoPessoa;
	private String cpf_cnpj;
	
	

	public Cliente(String nome, TipoPessoa tipoPessoa, String cpf_cnpj) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa.getId();
		this.cpf_cnpj = cpf_cnpj;
	}

	public Cliente() {
	}

		
	public String getNome() {
		return nome;
	}

	public Integer getTipoPessoa() {
		return tipoPessoa;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome+";");
		sb.append(TipoPessoa.toEnum(tipoPessoa)+";");
		sb.append(cpf_cnpj);

		return sb.toString();

	}

	
	

}

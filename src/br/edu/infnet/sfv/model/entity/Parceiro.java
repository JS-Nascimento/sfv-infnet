package br.edu.infnet.sfv.model.entity;

import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;
import static br.edu.infnet.sfv.validation.EntityAttribuites.AttribuitesValidation.*;

public abstract class Parceiro {

	private String nome;
	private Integer tipoPessoa;
	private Integer tipoParceiro;
	private String email;

	public Parceiro(String nome,  TipoPessoa tipoPessoa, TipoParceiro tipoParceiro, String email) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa.getId();
		this.tipoParceiro = tipoParceiro.getId();
		setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoPessoa() {
		return TipoPessoa.toEnum(tipoPessoa);
	}

	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		if (isValidEmailAddressRegex(email)) {

			this.email = email;

		}

	}

	public String getTipoParceiro() {
		return TipoParceiro.toEnum(tipoParceiro);
	}

	public void setTipoParceiro(int tipoParceiro) {
		this.tipoParceiro = tipoParceiro;
	}

	public abstract Double calculaPercentual(Double valorVenda);

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(TipoParceiro.toEnum(tipoParceiro) + ":");
		sb.append(nome + ";");
		sb.append(email + ";");
		sb.append(TipoPessoa.toEnum(tipoPessoa) + ";");

		return sb.toString();
	}

}

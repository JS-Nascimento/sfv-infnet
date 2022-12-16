package br.edu.infnet.sfv.model.entity;


import java.text.NumberFormat;
import static br.edu.infnet.sfv.validation.EntityAttribuites.AttribuitesValidation.isValidDecimalNumber;
import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.MathFunctions.*;
import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;

public class Vendedor extends Parceiro {

	private Double comissao;
	private Double metaDeVendas;
	private String areaDeAtendimento;

	public Vendedor(String nome, TipoPessoa tipoPessoa, TipoParceiro tipoParceiro, String email, Double comissao,
			Double metaDeVendas, String areaDeAtendimento) {
		super(nome, tipoPessoa, tipoParceiro, email);
		setComissao(comissao);
		setMetaDeVendas(metaDeVendas);
		setAreaDeAtendimento(areaDeAtendimento);
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		if (isValidDecimalNumber(comissao)) {

			this.comissao = comissao;
		}

	}

	public Double getMetaDeVendas() {

		return metaDeVendas;
	}

	public void setMetaDeVendas(Double metaDeVendas) {
		if (isValidDecimalNumber(metaDeVendas)) {

			this.metaDeVendas = metaDeVendas;
		}

	}

	public String getAreaDeAtendimento() {
		return areaDeAtendimento;
	}

	public void setAreaDeAtendimento(String areaDeAtendimento) {
		this.areaDeAtendimento = areaDeAtendimento;
	}

	@Override
	public Double calculaPercentual(Double valorVenda) {
		return calculatePercentage(valorVenda, comissao);
	}

	@Override
	public String toString() {

		return super.toString() + NumberFormat.getPercentInstance().format(comissao / 100) + ";"
				+ NumberFormat.getCurrencyInstance().format(metaDeVendas) + ";" + areaDeAtendimento;
	}

}

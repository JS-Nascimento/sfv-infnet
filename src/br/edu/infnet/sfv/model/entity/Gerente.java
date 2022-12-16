package br.edu.infnet.sfv.model.entity;

import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.MathFunctions.*;
import static br.edu.infnet.sfv.validation.EntityAttribuites.AttribuitesValidation.isValidDecimalNumber;

import java.text.NumberFormat;

import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;

public class Gerente extends Parceiro {



	private Double descontoGerencial;
	private Integer quantidadeMembrosEquipe;
	private String nomeEquipe;
	
	
	public Gerente(String nome, TipoPessoa tipoPessoa, TipoParceiro tipoParceiro, String email,
			Double descontoGerencial, Integer quantidadeMembrosEquipe, String nomeEquipe) {
		super(nome, tipoPessoa, tipoParceiro, email);
		setDescontoGerencial(descontoGerencial);
		setQuantidadeMembrosEquipe(quantidadeMembrosEquipe);
		setNomeEquipe(nomeEquipe);
	}
	
	

	public Double getDescontoGerencial() {
		return descontoGerencial;
	}



	public void setDescontoGerencial(Double descontoGerencial) {
		if (isValidDecimalNumber(descontoGerencial)) {
			
			this.descontoGerencial = descontoGerencial;
		}
	}



	public Integer getQuantidadeMembrosEquipe() {
		return quantidadeMembrosEquipe;
	}



	public void setQuantidadeMembrosEquipe(Integer quantidadeMembrosEquipe) {
		this.quantidadeMembrosEquipe = quantidadeMembrosEquipe;
	}



	public String getNomeEquipe() {
		return nomeEquipe;
	}



	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}



	@Override
	public Double calculaPercentual(Double valorVenda) {
		return calculatePercentage(valorVenda, descontoGerencial);

	}



	@Override
	public String toString() {
		return super.toString() + NumberFormat.getPercentInstance().format(descontoGerencial/100) + ";" +  quantidadeMembrosEquipe + ";"+ nomeEquipe ;
	}
	
	

}

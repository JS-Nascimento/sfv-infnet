package br.edu.infnet.sfv.model.entity;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import static br.edu.infnet.sfv.validation.EntityAttribuites.AttribuitesValidation.isValidDecimalNumber;
import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.MathFunctions.toCurrency;

public class Venda {

	private Integer nuNota;
	private Cliente cliente;
	private LocalDate dataDaVenda;
	private Boolean vendaBonificada;
	private Double desconto;
	private Double valorVenda;
	private Double valorFinalVenda = 0.00;

	private List<Parceiro> parceiros = new ArrayList<>();

	public Venda(Integer nuNota, Cliente cliente, Boolean vendaBonificada, Double valorVenda) {
		this.nuNota = nuNota;
		this.cliente = cliente;
		this.dataDaVenda = LocalDate.now();
		this.vendaBonificada = vendaBonificada;
		this.valorVenda = valorVenda;

		/*
		 * this.vendedorResponsavel = vendedorResponsavel; this.fornecedorVendido =
		 * fornecedorVendido; this.gerenteVenda = gerenteVenda;
		 */
	}

	public Venda() {

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getNuNota() {
		return nuNota;
	}

	public void setNuNota(Integer nuNota) {
		this.nuNota = nuNota;
	}

	public String getDataDaVenda() {

		return dataDaVenda.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public String getVendaBonificada() {

		String isBonificada = vendaBonificada ? "Sim" : "Não";

		return isBonificada;
	}

	public void setVendaBonificada(Boolean vendaBonificada) {
		this.vendaBonificada = vendaBonificada;
	}

	public Double getValorVenda() {

		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Double getDesconto() {

		return desconto;
	}

	private void setDesconto(Double desconto) {
		
		this.desconto = desconto;

	}

	public Double getValorFinalVenda() {
		return valorFinalVenda;
	}

	public void setValorFinalVenda(Double valorFinalVenda) {

		if (isValidDecimalNumber(valorFinalVenda)) {
			this.valorFinalVenda = valorFinalVenda;
			setDesconto(getValorVenda() - valorFinalVenda);

		}

	}

	public List<Parceiro> getParceiros() {
		return parceiros;
	}

	public void setParceiros(List<Parceiro> parceiros) {
		this.parceiros = parceiros;
	}

	@Override
	public String toString() {
		return "Venda: " + nuNota + ";" + "CLIENTE:" + this.cliente + ";" + this.getDataDaVenda() + ";" + this.getVendaBonificada()
				+ ";" + toCurrency(valorVenda) + ";" + toCurrency(desconto) + ";" + toCurrency(valorFinalVenda) + ";"
				+ this.getParceiros().size();

	}

}

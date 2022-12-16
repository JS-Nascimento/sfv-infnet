package br.edu.infnet.sfv.model.entity;



import java.text.NumberFormat;
import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.MathFunctions.calculatePercentage;
import static br.edu.infnet.sfv.validation.EntityAttribuites.AttribuitesValidation.isValidDecimalNumber;
import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;

public class Fornecedor extends Parceiro {

	private boolean fidelizado;
	private Double descontoExtra;
	private Double descontoNormal;

	public Fornecedor(String nome, TipoPessoa tipoPessoa, TipoParceiro tipoParceiro, String email, boolean fidelizado,
			Double descontoExtra, Double descontoNormal) {
		super(nome, tipoPessoa, tipoParceiro, email);
		setFidelizado(fidelizado);
		setDescontoExtra(descontoExtra);
		setDescontoNormal(descontoNormal);
	}

	public boolean isFidelizado() {
		return fidelizado;
	}

	public void setFidelizado(boolean fidelizado) {
		this.fidelizado = fidelizado;
	}

	public Double getDescontoExtra() {
		return descontoExtra;
	}

	public void setDescontoExtra(Double descontoExtra) {
		if (isValidDecimalNumber(descontoExtra)) {
			this.descontoExtra = descontoExtra;

		}
		this.descontoExtra = descontoExtra;
	}

	public Double getDescontoNormal() {
		return descontoNormal;
	}

	public void setDescontoNormal(Double descontoNormal) {
		if (isValidDecimalNumber(descontoNormal)) {
			this.descontoNormal = descontoNormal;

		}

	}

	@Override
	public Double calculaPercentual(Double valorVenda) {
		Double valorFidelizado = 0.0;
		if(isFidelizado()) {
			valorFidelizado = calculatePercentage(valorVenda, descontoNormal);
			return  calculatePercentage(valorFidelizado, descontoExtra);
		}
		
		return calculatePercentage(valorVenda, descontoNormal);
		
	}

	@Override
	public String toString() {
		return super.toString() + (fidelizado ? "Fornecedor Fidelizado" : "Fornecedor Comum") + ";"
				+ NumberFormat.getPercentInstance().format(descontoExtra / 100) + ";"
				+ NumberFormat.getPercentInstance().format(descontoNormal / 100);
	}

}

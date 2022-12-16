package br.edu.infnet.sfv.test;

import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.MathFunctions.toCurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.MathFunctions.*;
import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;
import br.edu.infnet.sfv.model.entity.Cliente;
import br.edu.infnet.sfv.model.entity.Fornecedor;
import br.edu.infnet.sfv.model.entity.Gerente;
import br.edu.infnet.sfv.model.entity.Venda;
import br.edu.infnet.sfv.model.entity.Vendedor;

public class VendaTest {
		
	public static void main(String[] args) {
		
		Double valorFinal = 0.0;
		
		Cliente cliente01 =  new Cliente("Jorge Nascimento", TipoPessoa.PESSOAFISICA, "084.686.267-08");
		
		Venda v1 = new Venda(9852, cliente01, false, 1599.99);	
		
		Vendedor vendedor1 = new Vendedor("Fernando", TipoPessoa.PESSOAFISICA,TipoParceiro.VENDEDOR,"fernando@mail.com", 5.0, 120000.00, "Zona Oeste");
		valorFinal =  vendedor1.calculaPercentual(v1.getValorVenda());
		
		Gerente g1 = new Gerente("Carlos Frederico", TipoPessoa.PESSOAFISICA, TipoParceiro.GERENTE, "carlos@vendas.com.br", 10.5, 10, "Equipe Furação");
		valorFinal = g1.calculaPercentual(valorFinal);
		
				
		Fornecedor f1 = new Fornecedor("3m do Brasil", TipoPessoa.PESSOAJURIDICA, TipoParceiro.FORNECEDOR , "contato@mmm.com", true, 5.0, 6.0);
		valorFinal = f1.calculaPercentual(valorFinal);
		
		v1.setValorFinalVenda(valorFinal);
		v1.setParceiros(Arrays.asList(vendedor1,g1,f1));
				
		List<?> printList = new ArrayList<>();
		printList = v1.getParceiros();
		System.out.println(v1);
		
		for (int i = 0; i < printList.size(); i++) {
				System.out.println(printList.get(i));
		}
		
		
		
	}
	
	
}

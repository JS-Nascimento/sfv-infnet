package br.edu.infnet.sfv.test;

import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;
import br.edu.infnet.sfv.model.entity.Fornecedor;

public class FornecedorTest {
	
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("3m do Brasil", TipoPessoa.PESSOAJURIDICA, TipoParceiro.FORNECEDOR , "contato@mmm.com", true, 5.0, 6.0);
		
		System.out.println(f1);
	}

}

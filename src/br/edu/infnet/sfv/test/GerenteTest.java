package br.edu.infnet.sfv.test;

import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;
import br.edu.infnet.sfv.model.entity.Gerente;

public class GerenteTest {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Carlos Frederico", TipoPessoa.PESSOAFISICA, TipoParceiro.GERENTE, "carlos@vendas.com.br", 10.0, 10, "Equipe Furação");
		
		System.out.println(g1);
		
	}
}

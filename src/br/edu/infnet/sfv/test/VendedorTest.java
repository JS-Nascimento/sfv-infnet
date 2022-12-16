package br.edu.infnet.sfv.test;

import br.edu.infnet.sfv.enums.TipoParceiro;
import br.edu.infnet.sfv.enums.TipoPessoa;
import br.edu.infnet.sfv.model.entity.Vendedor;

public class VendedorTest {
			public static void main(String[] args) {
				
				Vendedor v1 = new Vendedor("Fernando", TipoPessoa.PESSOAFISICA,TipoParceiro.VENDEDOR,"fernando@mail.com", 5.0, 120000.00, "Zona Oeste");
				
				System.out.println(v1);
				
			}
}

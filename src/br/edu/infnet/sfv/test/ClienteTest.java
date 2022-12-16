package br.edu.infnet.sfv.test;

import br.edu.infnet.sfv.enums.TipoPessoa;
import br.edu.infnet.sfv.model.entity.Cliente;

public class ClienteTest {

		public static void main(String[] args) {
			
			Cliente cliente01 = new Cliente("Jorge Nascimento", TipoPessoa.PESSOAFISICA, "084.686.267-08");
			
			System.out.println(cliente01);
			
		}
}

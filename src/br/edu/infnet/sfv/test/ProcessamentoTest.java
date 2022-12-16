package br.edu.infnet.sfv.test;

import br.edu.infnet.sfv.report.ReadFile;
import br.edu.infnet.sfv.report.WriteFile;


public class ProcessamentoTest {

		public static void main(String[] args) {
			
			
			ReadFile rf = new ReadFile("C:\\Curso Java\\sfv-infnet\\src\\resources\\in.txt"); 
			
			WriteFile wf = new WriteFile("C:\\Curso Java\\sfv-infnet\\src\\resources", "out_venda" );  
						
			wf.writeLine(rf.readFromFile());
			
			System.out.println("\n---------- Processamento finalizado------------\n");
			
			
			
		}
	
	
	
	
	

		
}

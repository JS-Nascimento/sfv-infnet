package br.edu.infnet.sfv.report;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static br.edu.infnet.sfv.auxiliary.AuxiliaryFunctions.WordFunctions.*;

public class ReadFile {
	
	private String[] array;
	
	private String path;
	
	
	public ReadFile(String path) {
		
		this.path = path;
	}

	public String readFromFile() {

		
		try (BufferedReader br = new BufferedReader(new FileReader(this.path))) {
			String line = br.readLine();
			int numberLine = 0;
			while (line != null) {

				System.out.println(line);
				
				if (numberLine == 0) { 

					this.array = stringToArray(line, ";");

				}
				
				line = br.readLine();
				numberLine++;
			}
			
			
			System.out.println("\n---------- Leitura finalizada------------\n");
			return getNewSentence(array);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			return e.getMessage();
		}

	}
	
	private String getNewSentence(String[] wordArray) {
		
		Integer[] positions = {0,1,9};
		
		String sentence = arrayToString(wordArray, positions );
		
		return sentence;
		
	}

}

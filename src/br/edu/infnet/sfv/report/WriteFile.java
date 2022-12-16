package br.edu.infnet.sfv.report;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	private String path; 
	private String textFileName;
	
	

	public WriteFile(String path, String textFileName) {
		
		this.path = path;
		this.textFileName = textFileName;
	}



	public void writeLine(String line) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\" + textFileName + ".txt" ))) {

			bw.write(line);
			bw.newLine();
			System.out.println("\n---------- Escrita finalizada------------\n");

		} catch (IOException e) {

			e.printStackTrace();
			
		}  
		
		
	}
}
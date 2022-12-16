package br.edu.infnet.sfv.auxiliary;

import java.text.NumberFormat;
import java.util.regex.Pattern;

public final class AuxiliaryFunctions {

	public static class MathFunctions{
		
		
		public static Double calculatePercentage(Double entryValue, Double percentage) {
			
			return (entryValue - (entryValue * (percentage/100)));
			
		}
		
		public static String toCurrency (Double valueToCast) {
			return NumberFormat.getCurrencyInstance().format(valueToCast);
		}
		
		
		
	}
	
	public static class WordFunctions{
		
		public static String[] stringToArray(String sentence, String delimiter) {
		
		String[] array = Pattern.compile(delimiter)
                    .splitAsStream(sentence)
                    .toArray(String[]::new);
			
			return array;
		}
		
		public static String arrayToString(String[] words, Integer[] positionWordtoSentence) {
			
			String sentence ="" ;
			
			try {
				
				for (int i = 0; i < positionWordtoSentence.length; i++) {
					
					sentence = sentence + words[positionWordtoSentence[i]] ;
										
						if(i  == positionWordtoSentence.length -1) {
							sentence = sentence + " .";
						}else {
							sentence = sentence + " , ";
						}
							
					
					
				}
				
				return sentence;
				
			} catch (IndexOutOfBoundsException e) {
				
				System.out.println("Error : " + e.getMessage());
				return null;
			} 

			
		}
		
		
	}
	
}

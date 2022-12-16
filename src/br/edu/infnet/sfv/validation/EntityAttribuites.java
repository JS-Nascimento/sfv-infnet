package br.edu.infnet.sfv.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.edu.infnet.sfv.exception.InvalidDecimalNumberException;
import br.edu.infnet.sfv.exception.InvalidEmailException;

public final class EntityAttribuites {

	public static class AttribuitesValidation {
		
		public static boolean isValidEmailAddressRegex(String email) {
			boolean isEmailIdValid = false;
			if (email != null && email.length() > 0) {
				String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
				Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(email);
				if (matcher.matches()) {
					isEmailIdValid = true;
				}else {
					throw new InvalidEmailException();
					
					
				}
							
			}
			return isEmailIdValid;
		}
		
		public static boolean isValidDecimalNumber(Double decimalNumber) {
			boolean isValidDecimal = false;
			if ( decimalNumber != null && decimalNumber > 0.0) {
				isValidDecimal = true;
				
			}else {
				throw new InvalidDecimalNumberException();
			}
						
			return isValidDecimal;
			
		}

	}
}

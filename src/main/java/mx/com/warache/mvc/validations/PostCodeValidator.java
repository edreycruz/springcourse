package mx.com.warache.mvc.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import mx.com.warache.mvc.validations.annotations.ValidPostCode;

public class PostCodeValidator implements ConstraintValidator<ValidPostCode, String> {

	private String postCodePrefix;

	@Override
	public void initialize(ValidPostCode cp) {
		this.postCodePrefix = cp.value();
	}

	@Override
	public boolean isValid(String cp, ConstraintValidatorContext arg1) {
		boolean isValid = false;

		if (cp != null) 
			isValid = cp.startsWith(postCodePrefix);
		else
			return true;
		
		return isValid;
	}

}

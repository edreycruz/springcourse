package mx.com.warache.mvc.validations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import mx.com.warache.mvc.validations.PostCodeValidator;


@Constraint(validatedBy = PostCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPostCode {

	String value() default "28";
	String message() default "Código postal no válido";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}

package mx.com.warache.mvc.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import mx.com.warache.mvc.validations.annotations.ValidPostCode;

public class Alumno {

	@NotNull
	@Size(min = 2, message = "Campo requerido, longitud mínima: 2")
	private String nombre;

	private String apellido;
	@NotNull
	@Min(value = 10, message = "La edad mínima requerida es 10 años")
	@Max(value = 120, message = "La edad máxima requerida es 120 años")
	private int edad;
	@Email
	private String email;
//	@NotNull
//	@Pattern(regexp = "[0-9]{5}", message = "Campo requerido, longitud mínima: 5")
	@ValidPostCode
	private String cp;
	private String materiaOptativa;
	private String genero;
	private String idioma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getMateriaOptativa() {
		return materiaOptativa;
	}

	public void setMateriaOptativa(String materiaOptativa) {
		this.materiaOptativa = materiaOptativa;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}

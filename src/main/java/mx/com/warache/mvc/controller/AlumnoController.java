package mx.com.warache.mvc.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import mx.com.warache.mvc.dto.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@InitBinder
	public void bindData(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/formulario")
	public String mostrarFormulario(Model model) {

		Alumno alumno = new Alumno();
		model.addAttribute("alumno", alumno);
		return "registro-alumno";
	}

	@RequestMapping("/registrar-alumno")
	public String registrarAlumno(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult validacion) {
		
		if(validacion.hasErrors()) {
			System.out.println("Hay errores en el formulario");
			return "registro-alumno";
		}
		return "confirmacion-registro-alumno";
	}
}

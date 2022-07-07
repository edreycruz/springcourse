package mx.com.warache.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/inicio")
public class SaludoController {

	@RequestMapping
	public String mostrarPagina() {
		return "bienvenida";
	}
	
	@RequestMapping("/formulario")
	public String mostrarFormulario() {
		
		return "formulario";
	}
	
	@RequestMapping("/procesar-formulario")
	public String procesarSaludo() {
		
		return "saludo";
	}
	
	@RequestMapping("/declarar")
	public String procesarFormularioParam(@RequestParam("nombre") String nombre, Model model) {
//		public String procesarFormularioParam(HttpServletRequest request, Model model) {
//		String nombre = request.getParameter("nombre");
		
		nombre += " es el más perrón.";
		String mensajeFinal = "¿Quién es el más perrón?\n";
		model.addAttribute("mensaje", mensajeFinal + nombre);
		return "saludo";
	}
	
}

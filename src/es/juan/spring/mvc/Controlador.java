package es.juan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Controller nos indica que esta ser� la clase del controlador
 * @RequestMapping lleva a la p�gina .jsp sobre la que se mostrar� la web
 */

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}

}

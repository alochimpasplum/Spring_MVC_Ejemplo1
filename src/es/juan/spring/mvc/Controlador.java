package es.juan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Controller nos indica que esta será la clase del controlador
 * @RequestMapping lleva a la página .jsp sobre la que se mostrará la web
 */

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}

}

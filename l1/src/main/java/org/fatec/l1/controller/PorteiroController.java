package org.fatec.l1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//precisa dizer pro spring que essa classe eh um controller 

@Controller //orientação a aspectos(annotation - etiqueta)
public class PorteiroController {

	@GetMapping("/")
	public String paginaInicial() {
		//modelandview
		
		return "index";
		
	}
	
	
}

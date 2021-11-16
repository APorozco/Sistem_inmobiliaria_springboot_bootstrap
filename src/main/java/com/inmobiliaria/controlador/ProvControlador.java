package com.inmobiliaria.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prov")
public class ProvControlador {

	@GetMapping("")
	public String inicio() {

		return "inicio";
	}
}

package com.example.demo.helloworlded;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String sayHello() {

		return "index";
	}
	
}

//comprobacion de que se sube el commit en la rama adecuada
//ya se ha creado la rama02 en el remoto, se subiran bien los cambios ahora?
// se supone q ya estoy en la rama main y he hecho rebase, porq no me deja subir? porq pide un git pull?
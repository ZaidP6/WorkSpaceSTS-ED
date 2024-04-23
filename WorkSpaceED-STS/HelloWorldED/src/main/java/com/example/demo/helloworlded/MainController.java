package com.example.demo.helloworlded;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String sayHello(Model model) {

		model.addAttribute("mensaje", "Hola mundo, CHAVALADA");
		return "index";
	}
<<<<<<< HEAD
	
}

//comprobacion de que se sube el commit en la rama adecuada
//ya se ha creado la rama02 en el remoto, se subiran bien los cambios ahora?
// se supone q ya estoy en la rama main y he hecho rebase, porq no me deja subir? porq pide un git pull?
=======
}
>>>>>>> a581368d5572a335956c7f775c0f2a437a2d8ba8

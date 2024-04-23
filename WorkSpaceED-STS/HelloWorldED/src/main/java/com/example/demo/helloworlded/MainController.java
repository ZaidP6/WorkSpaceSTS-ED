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
=======
}
>>>>>>> a581368 (controller actualizado)

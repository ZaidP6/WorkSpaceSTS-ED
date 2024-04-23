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

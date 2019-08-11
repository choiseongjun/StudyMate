package ref.port.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portFolio")
public class portController {

	
	@RequestMapping("/portlist")
	public String portlist() {
		return "Portfolio/portList";
	}
}

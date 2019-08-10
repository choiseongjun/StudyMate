package ref.port.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 
 * @author choiseongjun
 * @Story About Portfolio Controller 
 * @Date 19.08.10
 */
@Controller
@RequestMapping("/portFolio")
public class portController {

	
	@RequestMapping("/portlist")
	public String portlist() {
		return "Portfolio/portList";
	}
}

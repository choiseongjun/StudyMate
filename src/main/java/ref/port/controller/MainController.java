package ref.port.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 
 * @author choiseongjun
 * @Story MainController
 * @Date 19.08.10
 */
@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "Main";
	}
}



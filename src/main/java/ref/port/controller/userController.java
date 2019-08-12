package ref.port.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ref.port.repository.portuserRepository;
import java.util.logging.Logger;
import ref.port.domain.portUser;



@Controller
@RequestMapping("/user/*")
public class userController {

	private final static Logger LOG = Logger.getGlobal();
	
	@Autowired
	portuserRepository userrepository;
	
	@GetMapping("signupView")
	public String signupView() {
		return "user/signup";
	}
	@GetMapping("signinView")
	public String loginView() {
		return "user/signin";
	} 
	@PostMapping("signup")
	public String signup(@ModelAttribute portUser portuser) {
		System.out.println("routing Test");
		System.out.println(portuser);
		userrepository.save(portuser);
		return "redirect:/";
	}
}

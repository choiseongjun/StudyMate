package ref.port.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ref.port.domain.portUser;
import ref.port.repository.portuserRepository;



@Controller
@RequestMapping("/user/*")
public class userController {

	private final static Logger LOG = Logger.getGlobal();
	
	@Autowired 
	portuserRepository userrepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("signupView")
	public String signupView() {
		return "user/signup";
	} 
	@GetMapping("signinView")
	public String loginView() {
		return "user/signin";
	} 
	@RequestMapping(name="signup",method = RequestMethod.POST)
	public String signup(@ModelAttribute portUser portuser) {
		System.out.println("routing Test");
		System.out.println(portuser); 
		portuser.setUserpwd(passwordEncoder.encode(portuser.getUserpwd()));//비밀번호 암호화 
		userrepository.save(portuser);
		return "redirect:/";
	}
}

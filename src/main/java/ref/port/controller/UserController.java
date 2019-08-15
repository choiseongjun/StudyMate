package ref.port.controller;

import java.util.logging.Logger;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ref.port.domain.PortUser;
import ref.port.repository.PortUserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	private final static Logger LOG = Logger.getGlobal(); // TODO : Change Log4j or Slf4j

	private final PortUserRepository userRepository; // TODO : Replace Service
	private final PasswordEncoder passwordEncoder; // TODO : Replace Service

	public UserController(PortUserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	@GetMapping("/signupView")
	public String signupView() {
		return "user/signup";
	} 

	@GetMapping("/signinView")
	public String loginView() {
		return "user/signin";
	}

	@PostMapping("/signup")
	public String signUp(@ModelAttribute PortUser portUser) {
		System.out.println("routing Test"); // TODO : REMOVE
		System.out.println(portUser);  // TODO : REMOVE

		portUser.setUserPwd(passwordEncoder.encode(portUser.getUserPwd()));//비밀번호 암호화
		userRepository.save(portUser);
		
		return "redirect:/";
	}
}

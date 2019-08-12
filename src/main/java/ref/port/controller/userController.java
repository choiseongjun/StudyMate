package ref.port.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
public class userController {

	
	@GetMapping("signupView")
	public String signupView() {
		return "user/signup";
	}
	@GetMapping("signinView")
	public String loginView() {
		return "user/signin";
	}
}

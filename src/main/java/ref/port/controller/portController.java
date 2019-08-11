package ref.port.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ref.port.domain.Board;
import ref.port.repository.boardRepository;

/*
 * 
 * @author choiseongjun
 * @Story About Portfolio Controller 
 * @Date 19.08.10
 */
@Controller
@RequestMapping("/portFolio")
public class portController {

	@Autowired
	boardRepository boardrepository;
	
//	//포트폴리오 리스트 경로  
//	@RequestMapping("/portlist")
//	public String portlist() {
//		return "Portfolio/portList";
//	}
	@RequestMapping("/portFormview")
	public String portForm() {
		return "Portfolio/portForm";
	}
	@RequestMapping("/portDetail")
	public String portDetail() {
		System.out.println("!!@!@!@!@");
		return "Portfolio/portDetail";
	}
	
	/*
	 * @author choiseongjun
	 * @Story 포트폴리오 리스트화면 조회 
	 * */ 
	@RequestMapping("/portlist")
	public String getAllportlist(Model model){
		List<Board> boardlist=boardrepository.findAll();
		model.addAttribute("boardlist",boardlist);
		  
		return "Portfolio/portList";
	} 
	
}

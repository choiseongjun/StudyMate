package ref.port.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ref.port.domain.Board;
import ref.port.repository.BoardRepository;

/*
 * 
 * @author choiseongjun
 * @Story About Portfolio Controller 
 * @Date 19.08.10
 */
@Controller
@RequestMapping("/portFolio")
public class PortController {

	private final BoardRepository boardRepository; // TODO : Replace Service

	public PortController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
//	//포트폴리오 리스트 경로  
//	@RequestMapping("/portlist")
//	public String portlist() {
//		return "Portfolio/portList";
//	}

	@GetMapping("/portFormview")
	public String portForm() {
		return "Portfolio/portForm";
	}

	@GetMapping("/portDetail")
	public String portDetail() {

		System.out.println("!!@!@!@!@"); // TODO : REMOVE

		return "Portfolio/portDetail";
	}
	
	/*
	 * @author choiseongjun
	 * @Story 포트폴리오 리스트화면 조회 
	 * */
	@GetMapping("/portlist")
	public String getAllPortList(Model model){

		// TODO : Replace Service
		List<Board> allBoardList = boardRepository.findAll();
		model.addAttribute("boardlist", allBoardList);

		return "Portfolio/portList";
	}

	/*
	 * @author choiseongjun
	 * @Story 포트폴리오 글쓰기  
	 * @Date 19-08-11
	 * */
	@PostMapping("/insertBoard")
	public String insertBoard(@ModelAttribute Board board) {

		System.out.println("Data Test"); // TODO : REMOVE
		System.out.println(board); // TODO : REMOVE

		// TODO : Replace Service
		boardRepository.save(board);

		return "redirect:/portFolio/portlist";
	}
	
}

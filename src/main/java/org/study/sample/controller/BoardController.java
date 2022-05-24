package org.study.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.sample.model.BoardDTO;
import org.study.sample.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		List<BoardDTO> list = boardService.boardList();
		model.addAttribute("list", list);
		return "Board/boardList";
	}
	
	@GetMapping("/boardInsert")
	public String boardInsert() {
		return "Board/boardInsert";
	}
	
	@PostMapping("/boardInsert")
	public String boardInsertProcess(BoardDTO dto) {
		
		boardService.boardInsert(dto);
		
		return "redirect:boardList";
	}
	
	@GetMapping("/boardRead")
	public String boardRead(@RequestParam("b_no")String b_no, Model model) {
		
		BoardDTO dto = boardService.boardRead(b_no);
		model.addAttribute("dto", dto);
		
		return "Board/boardRead";
	}
	
	@GetMapping("/boardUpdate")
	public String boardUpdate(@RequestParam("b_no")String b_no, Model model) {
		
		BoardDTO dto = boardService.boardRead(b_no);
		model.addAttribute("dto", dto);
		
		return "Board/boardUpdate";
	}
	
	@PostMapping("/boardUpdate")
	public String boardUpdateProcess(BoardDTO dto) {
		
		boardService.boardUpdate(dto);
		System.out.println("update controller");
		
		return "redirect:/boardRead?b_no="+dto.getB_no();
	}
	
	@GetMapping("/boardDelete")
	public String boardDelete(@RequestParam("b_no")String b_no) {
		System.out.println("값 확인 : " + b_no);
		boardService.boardDelete(b_no);
		System.out.println("delete controller");
		
		return "redirect:boardList";
	}
	
}

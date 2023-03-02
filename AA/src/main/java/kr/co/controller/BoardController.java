package kr.co.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/board_list")
    public String list(){
    	
		return "board/board_list";
    }
}

package kr.co.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import kr.co.entity.Member;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/room_list")
    public String room_list() {
        
        return "main/room_list";
    }

    @GetMapping("/sign_in")
	public String sign_in() {
		return "sign_in";
	}  
    
}


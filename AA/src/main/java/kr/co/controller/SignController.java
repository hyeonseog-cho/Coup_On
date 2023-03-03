package kr.co.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignController {
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }
		
}

package kr.co.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mainpage")
public class MainController {


    @GetMapping("/room-list")
    public String rooms() {
        
        return "/mainpage/room-list";
    }


    @GetMapping("")
    public String index() {
        return "index";
    }
}
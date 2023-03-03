package kr.co.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/room_list")
    public String room_list() {
        
        return "main/room_list";
    }


}
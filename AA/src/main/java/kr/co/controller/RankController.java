package kr.co.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rank")
public class RankController {

	@GetMapping("/rank_list")
	public String rank_list() {
		return "rank/rank_list";
	}
}

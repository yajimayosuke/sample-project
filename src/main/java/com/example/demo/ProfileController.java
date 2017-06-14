package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	@RequestMapping("/index")
	public String index(){
		return "list";
	}
	
	@RequestMapping("/yajima")
	public String yajima(){
		return "yajima";
	}
	
	@RequestMapping("/miyajima")
	public String miyajima(){
		return "miyajima";
	}
	
	@RequestMapping("/kojima")
	public String kojima(){
		return "kojima";
	}
}

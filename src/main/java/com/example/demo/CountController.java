package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountController {
	Integer count = 0;
	@RequestMapping("/your_server")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/your_server/counter")
	public String countTimes(HttpSession session) {
		session.setAttribute("count", count);
			count++;
			return "showCounter.jsp";
	}
	
}

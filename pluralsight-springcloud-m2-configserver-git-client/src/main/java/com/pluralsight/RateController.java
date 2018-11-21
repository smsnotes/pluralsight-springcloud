package com.pluralsight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

	
	@Value("${debugInfo}")
	private String  debugInfo;
	
	@Value("${lanecount}")
	private String  lanecount;

	
	@Value("${rate}")
	private String rate; 
	

	@Value("${tollstart}")
	private String  tollstart;
	
	@Value("${connstring}")
	private String  connstring;
	
	@RequestMapping("/rate")
	public String getRate (Model m ) {
		
		m.addAttribute("rateamount", rate);
		m.addAttribute("lanes", lanecount);
		m.addAttribute("tollstart", tollstart);
		m.addAttribute("connstring", connstring);
		m.addAttribute("debugInfo", debugInfo);
		
		return "retview";
	}
	
	
}

package com.myfirstsite.mvc;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class Form {

	@RequestMapping("/showForm")
	public String showForm() { //return form to user view
		String result = "firstForm";
		
		return result;
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "response";
	}
	
	
	@RequestMapping("/processFormDeeper")
	//public String processFormDeeper(HttpServletRequest request, Model model) { // old way to process parameters
	public String processFormDeeper(@RequestParam("name") String name, Model model) { // new way yo process params with annotations
		
		//String name = request.getParameter("name"); //manually get the parameters
		
		name+=" is the best coder! ";
		
		String finalMessage = "Who is the best coder? " + name;
		
		model.addAttribute("responseMessage", finalMessage);
		
		return "deepResponse";
	}
	
}

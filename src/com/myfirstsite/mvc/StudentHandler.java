package com.myfirstsite.mvc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myfirstsite.mvc.beans.Student;

@Controller
@RequestMapping("/student")
public class StudentHandler {
	
	@RequestMapping("/showStudentForm")
	public String showStudentForm (Model model){
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		
		return "studentRegister";
	}
	
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		StringTrimmerEditor trimWhiteSpaces = new StringTrimmerEditor(true /*Empty as null*/ );
			
		//binder.registerCustomEditor(String.class, "firstName", trimWhiteSpaces);
		//binder.registerCustomEditor(String.class, "lastName", trimWhiteSpaces);
		//binder.registerCustomEditor(String.class, "email", trimWhiteSpaces);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//dateFormat.
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class,  "birthdate", new CustomDateEditor(dateFormat, true));
//		
	}
	
//	 @RequestMapping(value = "/showPreferences", method = RequestMethod.POST)
//	    public String showPreferences(@ModelAttribute("preferences") UserPreferences preferences, Model model) throws Exception{
//	        model.addAttribute("preferences", preferences);
//	        return "showPreferences";
//	    }
	 
	// List for "Profession" dropdown
    @ModelAttribute("professionList")
    public List<String> getExerciseList(){
        
    	List<String> professionList = new ArrayList<>();
		
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
       
        return professionList;
    }
	
	@RequestMapping("/registerStudent")
	public String registerStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		String result = "";
		System.out.println("student saved in database " + student.getFirstName() + " "+student.getLastName());
		
		result =  bindingResult.hasErrors() ? "studentRegister" :  "studentConfirmation";
		
		System.out.println(bindingResult.getAllErrors());
		// here you will save students in a db 
		
		return result;
		
	}
	
}

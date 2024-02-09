package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.transaction.Transactional;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	//its automatic call both in show and help method 
	
	@ModelAttribute
	public void commonCode(Model model) {
		model.addAttribute("header", "Student Form");
		model.addAttribute("desc", "form for all student");		
	}
	

	@RequestMapping("/contact")
	public String showForm(Model model) {
//		model.addAttribute("header", "Student Form");
//		model.addAttribute("desc", "form for all student");
		return "contact";
	}
	
	
	/*
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("name") String userName, 
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword,
			Model model) 
	{
		
		User user = new User();
		user.setName(userName);
		user.setEmail(userEmail);
		user.setPassword(userPassword);
		
		
		System.out.println("User Name :" + userName);
		System.out.println("User Email :" + userEmail);
		System.out.println("User Password :" + userPassword);
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);

		model.addAttribute("user", user);
		return "success";
	}
	
	*/
	
// Spring MVC Provide eays way to take form in easy way
// @ModelAttribute accept the data from forms
	
	// integrate ORM

	@Transactional
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm( @ModelAttribute User user, Model model) 
	{
		System.out.println(user);
		
		if(user.getName().isBlank())
			return "redirect: /contact";
			
		int id = userService.saveUser(user);
		model.addAttribute("msg", "User created with id : "+id);
		
		return "success";
	}
	
	

	
	
	
}

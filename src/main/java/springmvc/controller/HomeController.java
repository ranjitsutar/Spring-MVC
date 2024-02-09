package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	//to dynamic return
	@RequestMapping("/home")
	public String home(Model model) 
	{
		System.out.println("This Home Page");
		model.addAttribute("name", "Ranjit");
		model.addAttribute("id",123);
		
		List<String> friend= new ArrayList();
		friend.add("Chandan");
		friend.add("Bara");
		friend.add("Sumit");
		model.addAttribute("friend", friend);

		return "index";
	}
	
	
	public String about() {
		
		return "About Page";
		
	}
	//model & view
	@RequestMapping(path = "/help", method = RequestMethod.GET)
	public ModelAndView help() {
		System.out.println("Helppage start");
		//create model&view object
		ModelAndView modelAndView = new ModelAndView();
		// set data
		modelAndView.addObject("name" , "Ranjit");
		modelAndView.addObject("rollnumber",1234);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		// setting the view name
		modelAndView.setViewName("help");
		
		// list 
		
		List<Integer> list = new ArrayList<>();		
		list.add(10);
		list.add(18);
		list.add(20);
		list.add(65);

		modelAndView.addObject("list", list);
		
		return modelAndView;
	}
	
}



package springmvc.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReditectExample {

	//Example of redirect prefix which one is relative redirect
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is page one  Handler");
		return "redirect: /two";
		
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is page Two  Handler");
		return "";
	}

	@RequestMapping("/three")
	public RedirectView three() {
		System.out.println("This is page Three  Handler");
		RedirectView redirect = new RedirectView();
		// we can redirect to any where by url
		redirect.setUrl("four");
//		redirect.getUrl("https://bhailang.js.org/#playground");
		return redirect;
	}

	public String foru() {
		System.out.println("This is page Four  Handler");
		return "";
	}

}

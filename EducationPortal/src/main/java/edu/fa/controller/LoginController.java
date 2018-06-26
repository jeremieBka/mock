package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.fa.model.Fresher;
import edu.fa.service.FresherService;

@Controller
public class LoginController {
	@Autowired
	FresherService fresherService;
//	@RequestMapping(value="login")
//	public ModelAndView showLogin() {
//		ModelAndView mav = new ModelAndView("login");
//		mav.addObject("fresher", new Fresher("Jeremie", "123456"));
//		return mav;
//	}
	
	
	@RequestMapping(value="login")
	public String showLogin(Model model) {
		model.addAttribute("fresher", new Fresher());
		return "login";
	}
	
	@RequestMapping(value="dashboard")
	public String loginToSystem(@ModelAttribute("fresher") Fresher fresher, Model model) {
		if(fresherService.login(fresher)) {
			
			return "dashboard";			
		}
		model.addAttribute("error", true);
		return "redirect:login";
	}
}

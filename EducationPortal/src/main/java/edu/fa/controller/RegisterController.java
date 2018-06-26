package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fa.model.Fresher;
import edu.fa.service.FresherService;

@Controller
public class RegisterController {
	@Autowired
	private FresherService fresherService;
	
	@RequestMapping(value="register")
	public String showregister(Model model) {
		model.addAttribute("fresher", new Fresher());
		return "register";
	}
	
	@RequestMapping(value="userRegister")
	public String register(@ModelAttribute Fresher fresher, Model model) {
		if(fresherService.register(fresher)) {
			model.addAttribute("fresher", new Fresher());
			return "redirect:login";
		}
		model.addAttribute("error", true);
		return "redirect:register";
	}
}

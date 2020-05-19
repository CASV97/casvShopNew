package com.casvshop.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.casvshop.model.dto.UserDto;
import com.casvshop.service.IUserService;

@Controller
public class RegistrationController {
	private final static Log LOG = LogFactory.getLog(RegistrationController.class);
	@Autowired
	IUserService userService;

	@GetMapping({ "/", "/registration" })
	public String showRegistrationForm(final Model model) {
		LOG.info("Rendering registration page.");
		final UserDto accountDto = new UserDto();
		model.addAttribute("user", accountDto);
		return "registration";
	}

	@PostMapping("/register")
	public ModelAndView registerUserAccount(@ModelAttribute("user") UserDto accountDto) {
		LOG.info("Registering user account with information: {" + accountDto + "}");
		userService.registerNewUserAccount(accountDto);
		return new ModelAndView("successRegister", "user", accountDto);
	}

}

package com.casvshop.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.casvshop.model.dto.UserDto;

@Controller
public class RegistrationController {
	private final static Log LOG = LogFactory.getLog(RegistrationController.class);

	@GetMapping({ "/", "/registration" })
	public String showRegistrationForm(final Model model) {
		LOG.info("Rendering registration page.");
		final UserDto accountDto = new UserDto();
		model.addAttribute("user", accountDto);
		return "/registration";
	}

	@PostMapping("/register")
	public ModelAndView registerUserAccount(@ModelAttribute("user") UserDto userDto) {
		LOG.info("Registering user account with information: {" + userDto + "}");

		return new ModelAndView("/successregistration");
	}

}

package com.antriksh.springboot.error.controller;

import org.springframework.boot.web.servlet.error.ErrorController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements ErrorController {
	private static final String PATH = "/error";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}
	@RequestMapping(value = PATH, method = RequestMethod.GET)
	public String defaultErrorMessage() {
		return "Requested Resource is not found!!!";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
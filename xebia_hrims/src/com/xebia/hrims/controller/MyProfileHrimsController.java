package com.xebia.hrims.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my-profile")
public class MyProfileHrimsController {

	@RequestMapping(value = "personaldetails", method = RequestMethod.GET)
	public @ResponseBody ModelAndView personaldetails(
			HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("my_profile/personaldetails");
	}

	@RequestMapping(value = "contactdetails", method = RequestMethod.GET)
	public @ResponseBody ModelAndView contactdetail(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("my_profile/contactdetails");
	}

	@RequestMapping(value = "getPersonalDetails", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> getPersonalDetails(
			HttpServletRequest request, HttpServletResponse response,
			@RequestParam String param1) {
		return null;
	}

}
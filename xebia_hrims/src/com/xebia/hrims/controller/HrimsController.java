package com.xebia.hrims.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.model.Leaves;
import com.xebia.hrims.service.leaves.ILeavesService;
import com.xebia.hrims.service.login.ILoginService;

@Controller
@RequestMapping("/")
public class HrimsController {

	@Autowired
	private ILoginService loginservice;

	@Autowired
	private ILeavesService leavesservice;

	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public @ResponseBody ModelAndView homepage(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "personaldetails", method = RequestMethod.GET)
	public @ResponseBody ModelAndView personaldetails(
			HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("personaldetails");
	}

	@RequestMapping(value = "contactdetails", method = RequestMethod.GET)
	public @ResponseBody ModelAndView contactdetail(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("contactdetails");
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public @ResponseBody ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, @RequestParam String userid,
			@RequestParam String password) {
		boolean result = false;
		result = loginservice.isValidUser(userid, password);
		if (!result) {
			return new ModelAndView("login");
		}

		return new ModelAndView("redirect:/dashboard.do");
	}

	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public @ResponseBody ModelAndView dashboard(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("dashboard");
	}

	@RequestMapping(value = "applyLeave", method = RequestMethod.GET)
	public @ResponseBody ModelAndView applyLeave(HttpServletRequest request,
			HttpServletResponse response) {
		List<Leaves> leaves = leavesservice.getLeavesType();
		return new ModelAndView("leaveform", "leaves", leaves);
	}

	@RequestMapping(value = "getPersonalDetails", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> getPersonalDetails(
			HttpServletRequest request, HttpServletResponse response,
			@RequestParam String param1) {

		String fname = (String) request.getParameterValues("fname");
		return null;
	}

	@RequestMapping(value = "getTypeOfLeaves", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> getTypeOfLeaves(
			HttpServletRequest request, HttpServletResponse response,
			@RequestParam String param1) {
		HashMap<String, String> leaves = new HashMap<String, String>();
		return leaves;
	}

}
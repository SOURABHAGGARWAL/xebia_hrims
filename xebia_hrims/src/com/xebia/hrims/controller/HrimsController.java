package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.model.employee.InitLogin;
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
		return new ModelAndView("login/login");
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public @ResponseBody ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, @RequestParam String userid,
			@RequestParam String password) {
		boolean result = false;
		result = loginservice.isValidUser(userid, password);
		
		if (!result) {
			return new ModelAndView("login/login", "errormessage", "UserId & Password Are Not Correct");
		}
		
		request.setAttribute("login", loginservice.getLogin(userid));
		
		return new ModelAndView("redirect:/dashboard.do");
	}

	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public @ResponseBody ModelAndView dashboard(HttpServletRequest request,
			HttpServletResponse response) {
		
		InitLogin login = (InitLogin) request.getAttribute("login");
		//System.out.println(login.getEmp_id());
		return new ModelAndView("user/dashboard");
	}

}
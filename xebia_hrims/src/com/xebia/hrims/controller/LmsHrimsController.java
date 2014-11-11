package com.xebia.hrims.controller;

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

import com.xebia.hrims.model.leave.Balance;
import com.xebia.hrims.service.leaves.ILeavesService;

@Controller
@RequestMapping("/lms")
public class LmsHrimsController {

	@Autowired
	private ILeavesService leavesservice;

	@RequestMapping(value = "applyLeave", method = RequestMethod.GET)
	public @ResponseBody ModelAndView applyLeave(HttpServletRequest request,
			HttpServletResponse response, @RequestParam String leaveType,
			@RequestParam String startDate, @RequestParam String startDateTime,
			@RequestParam String endDate, @RequestParam String endDateTime,
			@RequestParam String reason, @RequestParam String handover,
			@RequestParam String notify) {

		String leaveinfo = leaveType + "," + startDate + "," + startDateTime
				+ "," + endDate + "," + endDateTime + "," + reason + ","
				+ handover + "," + notify;
		leavesservice.applyLeave(leaveinfo);
		return new ModelAndView("leaveform", "leaves",
				leavesservice.getEmployeeLeaves());
	}

	@RequestMapping(value = "leaveForm", method = RequestMethod.GET)
	public @ResponseBody ModelAndView leaveForm(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("leave/apply", "leaves",
				leavesservice.getEmployeeLeaves());
	}

	@RequestMapping(value = "cancleLeave", method = RequestMethod.GET)
	public @ResponseBody ModelAndView cancleLeave(HttpServletRequest request,
			HttpServletResponse response) {
		List<Balance> leaveInfo = leavesservice.getLeaveInfo();
		return new ModelAndView("leave/cancel", "leaveinfo", leaveInfo);
	}

}
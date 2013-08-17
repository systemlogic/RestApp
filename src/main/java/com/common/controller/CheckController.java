package com.common.controller;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.model.UID;

@Controller
public class CheckController {
	@ResponseBody @RequestMapping(value="/description", method = RequestMethod.GET )
	public UID getDescription(){
		UID uid = new UID("Pranshi", "Dhingra");
	    return uid;
	}
}

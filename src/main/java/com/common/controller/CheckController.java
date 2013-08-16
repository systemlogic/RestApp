package com.common.controller;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckController {
	@ResponseBody @RequestMapping(value="/description", method = RequestMethod.GET )
	public UID getDescription(){
		UID uid = new UID("Pranshi", "Dhingra");
	    return uid;
	}
}
@XmlRootElement
class UID {
	String firstname;
	String lastName;
	public UID(String f,String l){
		firstname = f ;
		lastName = l;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
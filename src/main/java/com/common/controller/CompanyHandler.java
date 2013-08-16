package com.common.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.common.connection.DeptConnection;
import com.common.model.Dept;

@Controller
@RequestMapping(value="/dept")
public class CompanyHandler {

	@Autowired
	DeptConnection connection;

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getDepts(@RequestParam(value="petId", required=false) Integer petId,
			HttpServletRequest   request,
			HttpServletResponse  response) throws Exception{
		String result ;
		ModelAndView mv = new ModelAndView();
		
		try{
			result = connection.getDepts();
		}catch(Exception e){
			mv.addObject("message", e.getMessage());
			mv.setViewName("error");
			return mv;	
		}
		mv.addObject("message",result);
		mv.setViewName("result");
		return mv;	

	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getDept(@PathVariable String id, HttpServletRequest   request,
			HttpServletResponse  response, ModelMap model) throws Exception{
		String result ;
		try{
			result = connection.getDept(id);
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
			return "error";	
		}
		model.addAttribute("message",result);
		return "result";

	}
	@RequestMapping(value="/{deptid}/{deptDesc}",method=RequestMethod.POST)
	@Transactional
	public String postDept(@PathVariable("deptid") String deptID, @PathVariable String deptDesc,
			HttpServletRequest   request,
			HttpServletResponse  response, ModelMap model) throws Exception{
		String result ;
		try{
			result = connection.postDept(deptID, deptDesc);
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
			return "error";
		}
		model.addAttribute("message", result);
		return "result";

	}
	@RequestMapping(value="/{deptid}/{deptDesc}",method=RequestMethod.PUT)
	@Transactional
	public String putDept(@PathVariable String deptid, @PathVariable String deptDesc,
			HttpServletRequest   request,
			HttpServletResponse  response, ModelMap model) throws Exception{
		String result ;
		try{
			result = connection.putDept(deptid, deptDesc);
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
			return "error";
		}
		model.addAttribute("message", result);
		return "result";

	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@Transactional
	public String deleteDept(@PathVariable String id, HttpServletRequest   request,
			HttpServletResponse  response, ModelMap model) throws Exception{
		String result ;
		try{
			result = connection.deleteDept(id);
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
			return "error";	
		}
		model.addAttribute("message", result);
		return "result";

	}
}

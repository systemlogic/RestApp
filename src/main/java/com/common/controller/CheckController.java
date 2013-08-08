package com.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CheckController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Object archiveSetting = null;
		ModelAndView modelView = null;
		modelView.addObject(null, archiveSetting);

		return modelView;
	}

}

package com.geekworld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.geekworld.serviceimpl.CrudServiceImpl;

@Controller
@RequestMapping("")
class IndexController {
	
	@Autowired
	private CrudServiceImpl crudServiceImpl;

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET, value="/saveBook")
    public String displayRequestPage() {
    	crudServiceImpl.saveBook();
        logger.debug("made it to controller");
        return "index";

    }


}

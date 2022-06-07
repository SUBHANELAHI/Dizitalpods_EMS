package com.project.dizitalpods_ems.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
//	@RequestMapping("/job")
//	public String index() {
//		return "index";
//	}

	@RequestMapping("/display")
	   public String display()
	   {
		   return "display";
	  }

	   @RequestMapping("/create")
	   public String insert()
	   {
		   return "create";
	  }
	   @RequestMapping("/update")
	   public String update()
	   {
		   return "update";
	  }
	   
	   @RequestMapping("/delete")
	   public String delete()
	   {
		   return "delete";
	  }
}
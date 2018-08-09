package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.service.SanCiSrevice;

@Controller
@RequestMapping("/sanci")
public class SanCiController {

	
		@Autowired
		private SanCiSrevice ciSrevice;
		
		@RequestMapping("/kaoshi")
		public String selectAll(Model model) {
			model.addAttribute("aa",ciSrevice.selectAll());
			return "123";
		}
}
  
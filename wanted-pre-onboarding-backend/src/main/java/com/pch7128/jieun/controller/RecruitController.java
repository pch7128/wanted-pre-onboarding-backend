package com.pch7128.jieun.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pch7128.jieun.dto.Notice;
import com.pch7128.jieun.svc.RecruitSvc;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	
	@Autowired
	private RecruitSvc rSvc;
	
	@GetMapping("/uploadList")
	public String listPage(Model m) {
		
		List<Notice> notices=rSvc.getList();
		m.addAttribute("notices", notices);
		return "recruit/noticeList";
	}
	
	@GetMapping("/add")
	public String addForm(Model m) {
		m.addAttribute("cm_id", "wanted");
		m.addAttribute("cm_num", "1");
		return "recruit/addForm";
	}
	
	@PostMapping("/regist/{cm_num}")
	public String add(@PathVariable("cm_num") int cm_num,Notice notice,Model m){
		
		
		boolean result=rSvc.saveNotice(cm_num,notice);
		
		
		if(result) {
			m.addAttribute("result","t");
		} else {
			m.addAttribute("result","f");
		}
		
		return "recruit/addResult";
	}

	
}

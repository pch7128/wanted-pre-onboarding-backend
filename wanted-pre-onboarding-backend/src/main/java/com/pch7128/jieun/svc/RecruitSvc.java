package com.pch7128.jieun.svc;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pch7128.jieun.dto.Company;
import com.pch7128.jieun.dto.Notice;
import com.pch7128.jieun.repository.CmRepository;
import com.pch7128.jieun.repository.NoticeRepository;

@Service
public class RecruitSvc {

	@Autowired
	private NoticeRepository nr;
	@Autowired
	private CmRepository cr;
	
	public boolean saveNotice(int cm_num,Notice notice) {
		Company cm=getCm(cm_num);
		notice.setCompany(cm);
		nr.save(notice);
		return true;
	}
	
	public Company getCm(int cm_num){
		Company cm=cr.findById(cm_num).orElseThrow();
		return cm;
	}
	
	public List<Notice> getList(){
		List<Notice> list=nr.findAll();
		return list;
	}
}

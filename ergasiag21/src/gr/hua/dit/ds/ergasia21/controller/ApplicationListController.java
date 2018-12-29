package gr.hua.dit.ds.ergasia21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.ergasia21.dao.ApplicationListDAO;
import gr.hua.dit.ds.ergasia21.entity.Application;

@Controller
@RequestMapping("/Applications")
public class ApplicationListController {
	@Autowired
	private ApplicationListDAO applicationListDAO;
	
	@RequestMapping("/list")
	public String appsList(Model model) {
		List<Application> applications = applicationListDAO.getApplications();
		
		model.addAttribute("applications",applications);
		
		return "ApplicationLists";
	}
}

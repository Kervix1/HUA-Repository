package gr.hua.dit.ds.ergasia21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.ergasia21.dao.UniversityListDAO;
import gr.hua.dit.ds.ergasia21.entity.University;

@Controller
@RequestMapping("/Universities")
public class UniversityListController {
	@Autowired
	private UniversityListDAO univeristyListDAO;
	
	@RequestMapping("/list")
	public String uniList(Model model) {
		List<University> universities = univeristyListDAO.getUniversities();
		
		model.addAttribute("universities",universities);
		
		return "UniversityList";
	}
}

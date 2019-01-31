package gr.hua.dit.ds.ergasia21.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.ds.ergasia21.dao.UniversityListDAO;
import gr.hua.dit.ds.ergasia21.entity.Student;
import gr.hua.dit.ds.ergasia21.entity.University;

@Controller
@RequestMapping("/Universities")
public class UniversityListController {
	@Autowired
	private UniversityListDAO univeristyListDAO;
	private SessionFactory sessionFactory;

	@RequestMapping("/list")
	public String uniList(Model model) {
		List<University> universities = univeristyListDAO.getUniversities();

		model.addAttribute("universities", universities);

		return "UniversityList";
	}

	@PostMapping("/saveUniversity")
	@Transactional
	public String saveUniversity(@ModelAttribute("university") University university) {
		try {
			univeristyListDAO.saveUniversities(university);
			return "success";
		} catch (Exception E) {
			return "failure";
		}
	}
	
	@PostMapping("/updateUniversity")
	@Transactional
	public String updateUniversity(@RequestParam("universityName")String name, @RequestParam("availablePositions") int pos) {	//TODO na balw tis metablhtes pou 8a pairnei apo to jsp
		univeristyListDAO.updateUniversities(name,pos);
		return "sec-menu";
	}
}

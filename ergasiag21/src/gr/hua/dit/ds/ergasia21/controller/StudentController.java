package gr.hua.dit.ds.ergasia21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.ergasia21.dao.StudentDAO;
import gr.hua.dit.ds.ergasia21.entity.Student;

@Controller
@RequestMapping("students")
public class StudentController {
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("/list")
	public String stdList(Model model) {
		List<Student> students = studentDAO.getStudents();
		
		model.addAttribute("students",students);
		return "StudentsList";
	}
}

package gr.hua.dit.ds.ergasia21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.ergasia21.entity.Student;
import gr.hua.dit.ds.ergasia21.service.StudentService;


@Controller
@RequestMapping("students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String stdList(Model model) {
		List<Student> students = studentService.getStudents();
		
		model.addAttribute("students",students);
		model.addAttribute("pageTitle" , "List students");
		return "StudentsList";
	}
	
	@GetMapping("/{id}")
	public String getStudent(Model model, @PathVariable("id") int id) {
		Student student = studentService.getStudent(id);
		System.out.println(student.getId());
		
		
		int idm = studentService.getStudent(id).getId();
		
		
		model.addAttribute("student", student);
		
		
		return "student-form";
	}
	
	
}

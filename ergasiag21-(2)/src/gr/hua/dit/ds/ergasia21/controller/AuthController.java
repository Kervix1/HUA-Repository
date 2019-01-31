package gr.hua.dit.ds.ergasia21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.ds.ergasia21.dao.AuthServiceDAO;
import gr.hua.dit.ds.ergasia21.entity.Student;

@Controller
@RequestMapping("/user")
public class AuthController {
	@Autowired
	AuthServiceDAO AuthServiceDAO;
	Student student;

	@PostMapping("/validate")
	public String Validation(@RequestParam("username") String username, @RequestParam("password") String password) {
		boolean isValid = AuthServiceDAO.findUser(username, password);

		String msg = "mphka!";
		if (isValid) {
			return "std-menu";
		} else {
			return "StudentLoginError";

		}
	}

}

package gr.hua.dit.ds.ergasia21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.ds.ergasia21.dao.SecretaryDAO;
import gr.hua.dit.ds.ergasia21.entity.Secretary;

@Controller
@RequestMapping("/Secretary")
public class SecretaryController {
	@Autowired 
	SecretaryDAO secretaryDAO;
	Secretary secretary;
	
	@PostMapping("/scvalidate")
	public String Scvalidation(@RequestParam("scusername")String username, @RequestParam("scpassword")String password) {
		boolean Scvalid = secretaryDAO.findSecretary(username,password);
		
		if(Scvalid) {
			System.out.println("mphka sthn valid" +username +password +Scvalid);
			return"sec-menu";
		} else {
			System.out.println("mphka sthn error" +username +password +Scvalid);
			return "SecretaryLoginError"; 
		}
		
	}

}

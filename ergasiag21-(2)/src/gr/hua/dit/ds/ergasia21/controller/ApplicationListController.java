package gr.hua.dit.ds.ergasia21.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.ergasia21.entity.Application;
import gr.hua.dit.ds.ergasia21.service.ApplicationService;

@Controller
@RequestMapping("/Applications")
public class ApplicationListController {

	@Autowired
	private ApplicationService applicationService;
	private SessionFactory sessionFactory;

	@RequestMapping("/list")
	public String appsList(Model model) {
		List<Application> applications = applicationService.getApplications();

		model.addAttribute("applications", applications);

		model.addAttribute("pageTitle", "List applications");

		return "ApplicationLists";
	}

	@GetMapping("/{am}")
	public String getApplByAm(Model model, @PathVariable("am") int am) {
		// create model attribute to get form data
		List<Application> applicationsByAm = applicationService.getApplicationByAm(am);

		model.addAttribute("applicationsByAm", applicationsByAm);

		return "ApplicationByAm"; // TODO

	}

	@GetMapping("/showAddListForm")
	public String showAddListForm(Model model) {
		// create model attribute to get form data
		Application application = new Application();
		model.addAttribute("application", application);

		// add page title
		model.addAttribute("pageTitle", "Add application");
		return "application-form"; // TODO
	}

	@PostMapping("/saveApplication")
	@Transactional
	public String saveApplication(@ModelAttribute("application") Application application) {
		// save the customer using the service
		try {
			applicationService.saveApplication(application);

			return "std-menu";
		} catch (Exception E) {
			return "UniversityList";
		}
	}

}

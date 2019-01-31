package gr.hua.dit.ds.ergasia21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ergasia21.entity.Application;
import gr.hua.dit.ds.ergasia21.dao.ApplicationListDAO;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationListDAO applicationListDAO;

	@Override
	public List<Application> getApplications() {
		return applicationListDAO.getApplications();
	}

	@Override
	public void saveApplication(Application application) {
		applicationListDAO.saveApplication(application);
	}

	@Override
	public List<Application> getApplicationByAm(int am) {

		return applicationListDAO.getApplicationByAm(am);
	}


	
	

}

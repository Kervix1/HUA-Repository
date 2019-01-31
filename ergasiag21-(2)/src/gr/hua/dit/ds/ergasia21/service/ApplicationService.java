package gr.hua.dit.ds.ergasia21.service;

import java.util.List;

import gr.hua.dit.ds.ergasia21.entity.Application;

public interface ApplicationService {
	public List<Application> getApplications();
	
	public void saveApplication(Application application);
		
	public List<Application> getApplicationByAm(int am);

}

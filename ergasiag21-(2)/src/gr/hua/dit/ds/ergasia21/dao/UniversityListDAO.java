package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import gr.hua.dit.ds.ergasia21.entity.University;

public interface UniversityListDAO {
	public List<University> getUniversities();
	
	public void saveUniversities(University university);
	
	public void updateUniversities(String name,int pos);
	
}

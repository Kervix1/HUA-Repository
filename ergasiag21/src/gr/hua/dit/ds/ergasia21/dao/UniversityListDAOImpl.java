package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.ergasia21.entity.University;

@Repository
public class UniversityListDAOImpl implements UniversityListDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<University> getUniversities() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		Query<University> query = currentSession.createQuery("from University", University.class);
		
        List<University> universities = query.getResultList();

		
		return universities;
	}
}

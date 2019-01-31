package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.ergasia21.entity.Application;

@Repository
public class ApplicationListDAOImpl implements ApplicationListDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Application> getApplications() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Application> query = currentSession.createQuery("from Application", Application.class);
		List<Application> applications = query.getResultList();

		return applications;
	}

	@Override
	@Transactional
	public void saveApplication(Application application) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
			System.out.println("INSERTED APPLICATION IS:"+application);
				currentSession.save(application);

	}
	

	@Override
	@Transactional
	public List<Application> getApplicationByAm(int am) {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Application> query = currentSession.createQuery("FROM Application WHERE user_id = " +am, Application.class);
		List<Application> applicationsByAm = query.getResultList();

		return applicationsByAm;	
	}


}

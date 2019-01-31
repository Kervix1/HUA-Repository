package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gr.hua.dit.ds.ergasia21.entity.Student;

@Repository
public class AuthServiceDAOImpl implements AuthServiceDAO {
	@Autowired
	private SessionFactory sessionFactory;
    

	@Transactional
	@Override
	public boolean findUser(String Sname, String Spwd) {
		
		boolean isValidUser = false;
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<Student> query = currentSession.createQuery(
					"from Student s where s.username= :name and s.password= :password",Student.class);
			query.setParameter("name", Sname);
			query.setParameter("password", Spwd);
			List<Student> std = query.getResultList();
			
			System.out.println("STUDENT IS "+std);

			if(std != null && std.size()>0) {
				isValidUser = true;
			}
		} catch(Exception e) {
			isValidUser = false;
			
		}
		return isValidUser;
	}

}

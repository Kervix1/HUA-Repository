package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gr.hua.dit.ds.ergasia21.entity.Secretary;
import gr.hua.dit.ds.ergasia21.entity.Student;

@Repository
public class SecretaryDAOImpl implements SecretaryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public boolean findSecretary(String SCname, String SCpwd) {
		boolean isValidSec = false;
		try {
			System.out.println("MPHKA STHN TRY");

			Session currentSession = sessionFactory.getCurrentSession();
			System.out.println("SESSION");

			Query<Secretary> query = currentSession.createQuery(
					"from Secretary c where c.username= :name and c.password= :password",Secretary.class);
			System.out.println("QUERY");

			query.setParameter("name", SCname);
			query.setParameter("password", SCpwd);
			List<Secretary> sc = query.getResultList();

			System.out.println("SECRETARY IS "+sc);

			if (sc != null && sc.size() > 0) {
				isValidSec = true;
			}
			} catch (Exception e) {
				System.out.println("FALSE ALARM");

			isValidSec = false;

		}
		return isValidSec;
	}

}

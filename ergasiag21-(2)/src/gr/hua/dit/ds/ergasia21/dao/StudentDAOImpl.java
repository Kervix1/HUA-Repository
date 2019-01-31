package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.ergasia21.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> query = currentSession.createQuery("from Student", Student.class);
		
        List<Student> students = query.getResultList();

		
		return students;
	}
	
	
	@Override
	public Student getStudent(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student student = currentSession.get(Student.class, id);
		return student;
	}

}

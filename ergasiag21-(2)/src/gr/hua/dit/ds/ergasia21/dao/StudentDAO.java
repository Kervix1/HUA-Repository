package gr.hua.dit.ds.ergasia21.dao;

import java.util.List;

import gr.hua.dit.ds.ergasia21.entity.Student;

public interface StudentDAO {
	public List<Student> getStudents();
		
	public Student getStudent(int id);
}

package gr.hua.dit.ds.ergasia21.service;

import java.util.List;

import gr.hua.dit.ds.ergasia21.entity.Student;
public interface StudentService {
	public List<Student> getStudents();
		
	public Student getStudent(int id);
}

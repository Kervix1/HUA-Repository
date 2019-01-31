package gr.hua.dit.ds.ergasia21.dao;

import gr.hua.dit.ds.ergasia21.entity.Student;

public interface AuthServiceDAO {
	public boolean findUser(String Sname, String Spwd);
}

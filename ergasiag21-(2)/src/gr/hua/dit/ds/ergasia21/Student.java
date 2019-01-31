package gr.hua.dit.ds.ergasia21;

import java.io.Serializable;

public class Student implements Serializable {

private String user;
private int pwd;
public Student(String user, int pwd) {
	super();
	this.user = user;
	this.pwd = pwd;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public int getPwd() {
	return pwd;
}
public void setPwd(int pwd) {
	this.pwd = pwd;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [user=" + user + ", pwd=" + pwd + "]";
}
}

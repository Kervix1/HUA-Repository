package gr.hua.dit.ds.ergasia21.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applications")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appl_id")
	private int applid;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "semister")
	private int semister;

	@Column(name = "university1")
	private String university1;

	@Column(name = "university2")
	private String university2;

	@Column(name = "university3")
	private String university3;

	@Column(name = "language1")
	private String language1;

	@Column(name = "language2")
	private String language2;

	@Column(name = "language3")
	private String language3;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "approved")
	private int approved;

	public Application() {

	}

	public String getUniversity1() {
		return university1;
	}

	public void setUniversity1(String university1) {
		this.university1 = university1;
	}

	public String getUniversity2() {
		return university2;
	}

	public void setUniversity2(String university2) {
		this.university2 = university2;
	}

	public String getUniversity3() {
		return university3;
	}

	public void setUniversity3(String university3) {
		this.university3 = university3;
	}

	public int isApproved() {
		return approved;
	}

	public void setApproved(int approved) {
		this.approved = approved;
	}

	public int getApplid() {
		return applid;
	}

	public void setApplid(int applid) {
		this.applid = applid;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}

	public String getLanguage1() {
		return language1;
	}

	public void setLanguage1(String language1) {
		this.language1 = language1;
	}

	public String getLanguage2() {
		return language2;
	}

	public void setLanguage2(String language2) {
		this.language2 = language2;
	}

	public String getLanguage3() {
		return language3;
	}

	public void setLanguage3(String language3) {
		this.language3 = language3;
	}

	public int getApproved() {
		return approved;
	}

	@Override
	public String toString() {
		return "Application [applid=" + applid + ", firstName=" + firstName + ", lastName=" + lastName + ", semister="
				+ semister + ", university1=" + university1 + ", university2=" + university2 + ", university3="
				+ university3 + ", language1=" + language1 + ", language2=" + language2 + ", language3=" + language3
				+ ", userId=" + userId + ", approved=" + approved + "]";
	}

}

package gr.hua.dit.ds.ergasia21.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "universities_list")
public class University {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private int iniversityid;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name= "university_language")
	private String universityLanguage;
	
	@Column(name= "Available_positions")
	private int availablePositions;
	
	public University() {
		
	}

	public int getIniversityid() {
		return iniversityid;
	}

	public void setIniversityid(int iniversityid) {
		this.iniversityid = iniversityid;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityLanguage() {
		return universityLanguage;
	}

	public void setUniversityLanguage(String universityLanguage) {
		this.universityLanguage = universityLanguage;
	}

	public int getAvailablePositions() {
		return availablePositions;
	}

	public void setAvailablePositions(int availablePositions) {
		this.availablePositions = availablePositions;
	}

	@Override
	public String toString() {
		return "University [iniversityid=" + iniversityid + ", universityName=" + universityName
				+ ", universityLanguage=" + universityLanguage + ", availablePositions=" + availablePositions + "]";
	}
	
}

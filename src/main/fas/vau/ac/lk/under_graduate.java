package fas.vau.ac.lk;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class under_graduate extends Person{
    @Id
	private String id;
	private String degree;
	private String university;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@ManyToMany
	@JoinTable(name="under_graduate_sessions ",
	           joinColumns = @JoinColumn(name="under_graduates_id"),
	           inverseJoinColumns = @JoinColumn(name="sessions_id"))
	private List<session> sessions;
}

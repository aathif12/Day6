package fas.vau.ac.lk;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class presenter extends Person {
	@Id
	private String id;
	private String affiliation;
	private String country;
	private String job_title;
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    @ManyToMany
	@JoinTable(name="presenter_sessions",
	           joinColumns = @JoinColumn(name="presenters_id"),
	           inverseJoinColumns  = @JoinColumn(name="sessions_id"))
	private List<session> sessions;

}

package fas.vau.ac.lk;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Post_graduate extends Person {
	@Id
	private String id;
	private String institute;
	private String research_interest;
	private String second_degree;
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getResearch_interest() {
        return research_interest;
    }

    public void setResearch_interest(String research_interest) {
        this.research_interest = research_interest;
    }

    public String getSecond_degree() {
        return second_degree;
    }

    public void setSecond_degree(String second_degree) {
        this.second_degree = second_degree;
    }

    @ManyToMany
	@JoinTable(name="post_graduate_sessions",
	           joinColumns = @JoinColumn(name="post_graduates_id"),
	           inverseJoinColumns =   @JoinColumn(name="sessions_id"))
    private List<session> sessions;
}

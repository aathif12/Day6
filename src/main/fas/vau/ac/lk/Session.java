package fas.vau.ac.lk;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class session {
	@Id
	private String id;
	private Date date;
	private String description;
	private String name;
	private Time time;
	private int workshop_id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getWorkshop_id() {
		return workshop_id;
	}

	public void setWorkshop_id(int workshop_id) {
		this.workshop_id = workshop_id;
	}

	@ManyToMany(mappedBy="sessions")
	private List<post_graduate> post_graduates;
	
	@ManyToMany(mappedBy="sessions")
    private List<under_graduate> under_graduates;
	
	@ManyToMany(mappedBy="sessions")
	private List<presenter>presenters;

}

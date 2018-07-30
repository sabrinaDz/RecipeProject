package sahli.springFramework.recipe.recipeProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;



@Entity
public class Notes {

	
	@Id
	private Long id;
	
    @OneToOne
	private Recipe recipe;
	
    @Lob
	private String note;
	
	

	public Notes() {
		 ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}

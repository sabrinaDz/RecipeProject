package sahli.springFramework.recipe.recipeProject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	private String description;
	
	
	@ManyToMany(mappedBy="categories")
	private Set<Recipe>recipes=new HashSet<Recipe>();
	
	public Category() {
		 
		// TODO Auto-generated constructor stub
	}

	 

	public Category(String description) {
		super();
		this.description = description;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

	 
	
	
	
}

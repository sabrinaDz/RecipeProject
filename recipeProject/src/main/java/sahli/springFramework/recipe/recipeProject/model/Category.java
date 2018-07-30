package sahli.springFramework.recipe.recipeProject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Category {

	@Id
	private Long id;
	 
	private String departmentName;
	
	
	@ManyToMany(mappedBy="categories")
	private Set<Recipe>recipes=new HashSet<Recipe>();
	
	public Category() {
		 
		// TODO Auto-generated constructor stub
	}

	public Category(String departmentName) {
		 
		this.departmentName = departmentName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}

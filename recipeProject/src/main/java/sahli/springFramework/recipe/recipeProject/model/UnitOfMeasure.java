package sahli.springFramework.recipe.recipeProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="UnitOfMeasure")
public class UnitOfMeasure {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String uom;
	
	

	 
	
	
}

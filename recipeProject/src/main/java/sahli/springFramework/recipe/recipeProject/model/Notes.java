package sahli.springFramework.recipe.recipeProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



@Entity
 @Getter
 @Setter
 @RequiredArgsConstructor 
public class Notes {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    @OneToOne
	private Recipe recipe;
	
    @Lob
	private String note;
	
	

	 

	 
	
	
}

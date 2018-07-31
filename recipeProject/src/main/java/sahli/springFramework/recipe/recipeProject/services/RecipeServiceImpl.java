package sahli.springFramework.recipe.recipeProject.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import sahli.springFramework.recipe.recipeProject.model.Recipe;
import sahli.springFramework.recipe.recipeProject.repositories.RecipeRepository;


@Service
public class RecipeServiceImpl implements RecipeService {

	
	private final RecipeRepository recipeRepository;

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		 
		this.recipeRepository = recipeRepository;
	}
	
	
	public Set<Recipe> getRecipes(){
		
		 Set<Recipe> recipeSet = new HashSet<>();
	     recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
	     return recipeSet;
		
	}
}

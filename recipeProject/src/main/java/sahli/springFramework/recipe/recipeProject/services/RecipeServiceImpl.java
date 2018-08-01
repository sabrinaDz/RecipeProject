package sahli.springFramework.recipe.recipeProject.services;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import sahli.springFramework.recipe.recipeProject.model.Recipe;
import sahli.springFramework.recipe.recipeProject.repositories.RecipeRepository;


@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {

	
	private final RecipeRepository recipeRepository;

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		 
		this.recipeRepository = recipeRepository;
	}
	
	
	public Set<Recipe> getRecipes(){
		 log.debug("Service logger");
		 Set<Recipe> recipeSet = new HashSet<>();
	     recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
	     return recipeSet;
		
	}
}

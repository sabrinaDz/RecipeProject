package sahli.springFramework.recipe.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;

import sahli.springFramework.recipe.recipeProject.model.Recipe;

public interface RecipeRepository  extends CrudRepository<Recipe,Long>{

}

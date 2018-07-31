package sahli.springFramework.recipe.recipeProject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import sahli.springFramework.recipe.recipeProject.model.Category;

public interface CategoryRepository extends CrudRepository<Category,Long>{

	
	Optional<Category>findByDescription(String description);
}

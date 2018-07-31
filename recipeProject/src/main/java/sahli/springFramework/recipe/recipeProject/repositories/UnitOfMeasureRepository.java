package sahli.springFramework.recipe.recipeProject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import sahli.springFramework.recipe.recipeProject.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

	Optional<UnitOfMeasure>getByUom(String uom);
}

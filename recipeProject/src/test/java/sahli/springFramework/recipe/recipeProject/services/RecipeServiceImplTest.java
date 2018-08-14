package sahli.springFramework.recipe.recipeProject.services;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import sahli.springFramework.recipe.recipeProject.model.Recipe;
import sahli.springFramework.recipe.recipeProject.repositories.RecipeRepository;

 
public class RecipeServiceImplTest {

	private RecipeServiceImpl recipeService;
	
	@Mock
	private RecipeRepository recipeRepository;
	
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeService=new RecipeServiceImpl(recipeRepository);
	}

	@Test
	public void testGetRecipes() {
		 
		    Recipe recipe = new Recipe();
	        HashSet recipesData = new HashSet();
	        recipesData.add(recipe);

	        when(recipeRepository.findAll()).thenReturn(recipesData);

	        Set<Recipe> recipes = recipeService.getRecipes();

	        assertEquals(recipes.size(), 1);
	        verify(recipeRepository, times(1)).findAll();
	}

}

package sahli.springFramework.recipe.recipeProject.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CategoryTest {

	
	private Category category;
	
	
	@Before
	public void setUp() throws Exception {
		category=new Category();
	}

	@Test
	public void testGetId() throws Exception {
		Long id=new Long(4L);
		 category.setId(id);
		 assertEquals(category.getId(),id);
	}

	@Test
	public void testGetDescription()throws Exception {
		 String description="category description";
		 category.setDescription(description);
		 assertEquals(category.getDescription(),description);
	}

	@Test
	public void testGetRecipes()throws Exception {
		 
	}

}

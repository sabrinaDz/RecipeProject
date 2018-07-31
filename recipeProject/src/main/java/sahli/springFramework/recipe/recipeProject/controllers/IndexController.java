package sahli.springFramework.recipe.recipeProject.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sahli.springFramework.recipe.recipeProject.model.Category;
import sahli.springFramework.recipe.recipeProject.model.UnitOfMeasure;
import sahli.springFramework.recipe.recipeProject.repositories.CategoryRepository;
import sahli.springFramework.recipe.recipeProject.repositories.UnitOfMeasureRepository;
import sahli.springFramework.recipe.recipeProject.services.RecipeService;


@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	private RecipeService recipeService;
	
	
	public IndexController(CategoryRepository categoryRepository,
			UnitOfMeasureRepository unitOfMeasureRepository, RecipeService recipeService) {
	 
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
		this.recipeService=recipeService;
	}



	@RequestMapping({"","/","index"})
	public String getIndex(Model model){
		
		/*Optional<Category>categoryOptional=categoryRepository.findByDescription("Algerian");
		Optional<UnitOfMeasure>unitOfMeasureOptional=unitOfMeasureRepository.getByUom("Pinch");
		System.out.println("category id est: "+categoryOptional.get().getId());
		System.out.println("unit of measure id est: "+unitOfMeasureOptional.get().getId());*/
		
		model.addAttribute("recipes",recipeService.getRecipes() );
		
		return "index";
	}
}

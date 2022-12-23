package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.when;

public class RecipeServiceImplTest extends TestCase {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        //method call in the Mockito framework that initializes the mock objects annotated with @Mock or @Spy in a test class.
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    public void testGetRecipes() {
        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);
        when(recipeService.getRecipes()).thenReturn(recipesData);
        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(), 1 );
    }
}
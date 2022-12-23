package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }
    @Test
    public void testGetId() {
        Long isValid = 4l;
        category.setId(isValid);
        assertEquals(isValid, category.getId());
    }

    public void testGetDescription() {
    }

    public void testGetRecipes() {
    }
}
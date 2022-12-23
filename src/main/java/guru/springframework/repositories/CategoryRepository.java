package guru.springframework.repositories;

import guru.springframework.domain.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by jt on 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}

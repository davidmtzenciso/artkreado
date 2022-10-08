package repository;

import model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, Long> {

    @Query("{name:'?0'}")
    Optional<Category> findItemByName(String name);

    @Query(value = "{}")
    List<Category> findAll();

}
package com.elatusdev.repository;

import com.elatusdev.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends MongoRepository<Author, Long> {

    @Query("{name:'?0'}")
    Optional<Author> findByName(String name);

    @Query(value = "{}")
    List<Author> findAll();

}
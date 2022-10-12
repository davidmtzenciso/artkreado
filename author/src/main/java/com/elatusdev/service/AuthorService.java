package com.elatusdev.service;

import com.elatusdev.exception.EntityNotFoundException;
import com.elatusdev.model.Author;
import com.elatusdev.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.elatusdev.repository.AuthorRepository;
import com.elatusdev.util.ErrorMsg;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repo;

    @Autowired
    private ErrorMsg errorMsg;

    public Author findByName(String name) throws EntityNotFoundException {
        Optional<Author> result = repo.findByName(name);
        if(result.isPresent()) {
            return result.get();
        } else {
            throw new EntityNotFoundException(errorMsg.getEntityNotFoundMsg("Author", name));
        }
    }

    public Author create(Long authorId, String name, Category category, String about){
        Author author = new Author(authorId,name,category,about);
        return repo.insert(author);
    }

    public Author update(Long authorId, String name, Category category, String about){
        Author author = new Author(authorId,name,category,about);
        return repo.save(author);
    }

    public Author remove(String name){
        Optional<Author> removed = repo.findByName(name);
        removed.ifPresent((author)->repo.delete(author));
        return removed.get();
    }

}

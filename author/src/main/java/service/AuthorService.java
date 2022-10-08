package service;

import exception.EntityNotFoundException;
import model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorRepository;
import util.ErrorMsg;

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
}

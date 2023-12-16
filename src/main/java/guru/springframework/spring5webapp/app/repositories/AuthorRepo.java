package guru.springframework.spring5webapp.app.repositories;

import guru.springframework.spring5webapp.app.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Long> {
}

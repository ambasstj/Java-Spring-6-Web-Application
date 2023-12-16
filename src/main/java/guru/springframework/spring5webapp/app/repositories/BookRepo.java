package guru.springframework.spring5webapp.app.repositories;

import guru.springframework.spring5webapp.app.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}

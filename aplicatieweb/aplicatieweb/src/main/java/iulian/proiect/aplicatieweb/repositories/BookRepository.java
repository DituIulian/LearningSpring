package iulian.proiect.aplicatieweb.repositories;

import iulian.proiect.aplicatieweb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

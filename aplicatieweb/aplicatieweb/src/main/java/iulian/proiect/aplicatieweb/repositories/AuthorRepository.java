package iulian.proiect.aplicatieweb.repositories;

import iulian.proiect.aplicatieweb.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {
}

package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}

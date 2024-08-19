package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }





    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        Author eric = new Author( "Eric" , "Evans");
        Book ddd = new Book("Domain Driver Design", " 1212121");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        publisherRepository.save(publisher);



        Author rod = new Author( "Rod" , "Johnson" );
        Book doEJB = new Book("J2ee Development without EJB", " 121212");
        rod.getBooks().add(doEJB);
        doEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(doEJB);
        doEJB.setPublisher(publisher);
        publisher.getBooks().add(doEJB);
        publisherRepository.save(publisher);



        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Books assign to publisher : " + publisher.getBooks().size());
    }
}
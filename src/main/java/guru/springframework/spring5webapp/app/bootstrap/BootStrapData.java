package guru.springframework.spring5webapp.app.bootstrap;

import guru.springframework.spring5webapp.app.domain.Author;
import guru.springframework.spring5webapp.app.domain.Book;
import guru.springframework.spring5webapp.app.repositories.AuthorRepo;
import guru.springframework.spring5webapp.app.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;

    public BootStrapData(BookRepo bookRepo, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author Eric = new Author("Eric","Rosen");
        Book Warrior = new Book("Warriors", "19sudu");
        Eric.getBooks().add(Warrior);
        Warrior.getAuthors().add(Eric);

        authorRepo.save(Eric);
        bookRepo.save(Warrior);

        Author Rod = new Author("Rod", "Johsnon");
        Book somethingElse = new Book("Some Other Book", "28ha8dfu0");
        Rod.getBooks().add(somethingElse);
        somethingElse.getAuthors().add(Rod);

        authorRepo.save(Rod);
        bookRepo.save(somethingElse);

        System.out.println("********Started in Bootstrap:");
        System.out.println("Number of Books:" + bookRepo.count());

    }
}

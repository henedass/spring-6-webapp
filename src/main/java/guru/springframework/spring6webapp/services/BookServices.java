package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

public interface BookServices  {
    Iterable<Book> findAll();
}

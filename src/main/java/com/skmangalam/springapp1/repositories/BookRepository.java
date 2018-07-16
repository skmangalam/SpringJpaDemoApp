package com.skmangalam.springapp1.repositories;

import com.skmangalam.springapp1.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

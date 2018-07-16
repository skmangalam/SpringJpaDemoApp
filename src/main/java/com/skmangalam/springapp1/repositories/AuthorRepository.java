package com.skmangalam.springapp1.repositories;

import com.skmangalam.springapp1.model.Author;


import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

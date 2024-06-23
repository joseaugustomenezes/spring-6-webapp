package com.josemenezes.spring6webapp.services;

import com.josemenezes.spring6webapp.domain.Author;

public interface AuthorService {
  Iterable<Author> findAll();
}

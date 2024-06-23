package com.josemenezes.spring6webapp.services;

import com.josemenezes.spring6webapp.domain.Book;

public interface BookService {

  Iterable<Book> findAll();
}

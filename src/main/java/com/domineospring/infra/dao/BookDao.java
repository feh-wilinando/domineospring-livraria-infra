package com.domineospring.infra.dao;

import com.domineospring.domain.models.Book;
import com.domineospring.domain.repository.BooksRepository;
import org.springframework.data.repository.Repository;

public interface BookDao extends Repository<Book, Integer>, BooksRepository {
}

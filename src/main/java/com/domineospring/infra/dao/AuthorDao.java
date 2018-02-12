package com.domineospring.infra.dao;

import com.domineospring.domain.models.Author;
import com.domineospring.domain.repository.AuthorRepository;
import org.springframework.data.repository.Repository;

public interface AuthorDao extends Repository<Author, String>, AuthorRepository {
}

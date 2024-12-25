package com.example.librarymngmnt_app.repository;

import com.example.librarymngmnt_app.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

/* 
package com.example.librarysystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarysystem.model.Book;
import com.example.librarysystem.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public boolean borrowBook(Long bookId) {
        Book book = bookRepository.findById(bookId).orElse(null);
        if (book != null && !book.isLoaned()) {
            book.setLoaned(true);
            bookRepository.save(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(Long bookId) {
        Book book = bookRepository.findById(bookId).orElse(null);
        if (book != null && book.isLoaned()) {
            book.setLoaned(false);
            bookRepository.save(book);
            return true;
        }
        return false;
    }
}
    */

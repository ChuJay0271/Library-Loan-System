/* 
package com.example.librarysystem.Controller;

import com.example.librarysystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/borrow/{bookId}")
    public String borrowBook(@PathVariable Long bookId) {
        if (bookService.borrowBook(bookId)) {
            return "借閱成功";
        } else {
            return "書籍不可借閱";
        }
    }

    @PostMapping("/return/{bookId}")
    public String returnBook(@PathVariable Long bookId) {
        if (bookService.returnBook(bookId)) {
            return "還書成功";
        } else {
            return "無法還書";
        }
    }
}
*/
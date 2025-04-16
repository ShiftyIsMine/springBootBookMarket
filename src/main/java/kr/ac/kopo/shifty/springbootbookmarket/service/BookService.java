package kr.ac.kopo.shifty.springbootbookmarket.service;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getbooksByCategory(String category);

}

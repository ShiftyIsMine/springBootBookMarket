package kr.ac.kopo.shifty.springbootbookmarket.service;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Filter;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getbooksByCategory(String category);
    void setNewBook(Book book);
    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
}

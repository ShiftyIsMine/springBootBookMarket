package kr.ac.kopo.shifty.springbootbookmarket.service;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import kr.ac.kopo.shifty.springbootbookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }

    @Override
    public Book getBookById(String bookId) {
        Book book = bookRepository.getBookById(bookId);
        return book;
    }

    @Override
    public List<Book> getbooksByCategory(String category) {
        List<Book> booksByCategory = bookRepository.getBookListCategory(category);
        return booksByCategory;
    }

    @Override
    public void setNewBook(Book book) {
        bookRepository.setNewBook(book);
    }

    @Override
    public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
        return booksByFilter;
    }

}
package kr.ac.kopo.shifty.springbootbookmarket.service;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import kr.ac.kopo.shifty.springbootbookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }
}
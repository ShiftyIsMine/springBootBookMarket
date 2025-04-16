package kr.ac.kopo.shifty.springbootbookmarket.repository;
import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBookListCategory(String category);
}

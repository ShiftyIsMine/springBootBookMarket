package kr.ac.kopo.shifty.springbootbookmarket.repository;
import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository
public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBookListCategory(String category);
    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
    void setNewBook(Book book);
}

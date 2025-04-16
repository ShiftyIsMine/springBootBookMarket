package kr.ac.kopo.shifty.springbootbookmarket.repository;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setAuthor("누구임?");
        book1.setName("스프링부트 완정");
        book1.setBookId("4024034");
        book1.setDescription("스프링부트 완전 정복하는 거야");
        book1.setCondition("신규");
        book1.setCategory("IT");
        book1.setReleaseDate("1991/01/24");
        book1.setPublisher("빛나는 한");
        book1.setUnitPrice(new BigDecimal(300000));
//        book1.setUnitPrice(new BigDecimal.valueOf(300000));
        book1.setUnitInStock(500);

        book2.setAuthor("who?");
        book2.setName("스프링부트 미완");
        book2.setBookId("87024034");
        book2.setDescription("스프링부트 불가능?");
        book2.setCondition("중고");
        book2.setCategory("IT");
        book2.setReleaseDate("2991/12/15");
        book2.setPublisher("빛나는 한");
        book2.setUnitPrice(new BigDecimal(400000));
//        book1.setUnitPrice(new BigDecimal.valueOf(300000));
        book2.setUnitInStock(100);

        book3.setAuthor("누군지 나도 모름");
        book3.setName("스프링부트 시작");
        book3.setBookId("2342355");
        book3.setDescription("스프링부트 완전 정복하는 시작하는 거야");
        book3.setCondition("신규");
        book3.setCategory("IT");
        book3.setReleaseDate("2091/05/03");
        book3.setPublisher("빛나는 한");
        book3.setUnitPrice(new BigDecimal(500000));
//        book1.setUnitPrice(new BigDecimal.valueOf(300000));
        book3.setUnitInStock(200);

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }

    @Override
    public Book getBookById(String bookId) {
        Book bookInfo = null;
        for (Book book : listOfBooks) {
            if (book!=null && book.getBookId()!=null && book.getBookId().equals(bookId)) {
                bookInfo = book;
                break;
            }
        }

        if(bookInfo==null){
            throw new IllegalArgumentException("도서번호가 <" +bookId + ">인 도서를 찾을 수가 없는데여");
        }
        return bookInfo;
    }

    @Override
    public List<Book> getBookListCategory(String category) {
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getCategory()!=null && book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }
        return booksByCategory;
    }
}

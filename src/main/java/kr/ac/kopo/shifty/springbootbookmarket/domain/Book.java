package kr.ac.kopo.shifty.springbootbookmarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor

public class Book {
    private String bookId;          //도서 번호
    private String name;            //도서명
    private String author;          //작가
    private BigDecimal unitPrice;   //단가
    private String description;     //설명
    private String publisher;       //출판사
    private String category;        //도서분류
    private long unitInStock;       //재고량
    private String releaseDate;     //출판일
    private String condition;       //신규 or 중고 or 전자책

}
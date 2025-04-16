package kr.ac.kopo.shifty.springbootbookmarket.controller;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import kr.ac.kopo.shifty.springbootbookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String requestBookList(Model model) {
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList",bookList);
        return "books";
    }
//
    @GetMapping(value = "/all")
    public ModelAndView requestAllBookList() {
        ModelAndView mAV = new ModelAndView();
        mAV.setViewName("books");
        List<Book> bookList = bookService.getAllBookList();
        mAV.addObject("bookList",bookList);
        return mAV;
    }

    @GetMapping("/book")
    public String requestBookById(@RequestParam("id") String bookId, Model model) {
        Book book = bookService.getBookById(bookId);
        model.addAttribute("book",book);
        return "book";
    }

    @GetMapping("/{category}")
    public String requestBookByCategory(@PathVariable("category") String category, Model model) {
        List<Book> booksByCategory = bookService.getbooksByCategory(category);
        model.addAttribute("bookList",booksByCategory);
        return "books";
    }
}

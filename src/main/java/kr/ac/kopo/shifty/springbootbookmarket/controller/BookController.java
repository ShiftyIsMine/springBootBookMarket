package kr.ac.kopo.shifty.springbootbookmarket.controller;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import kr.ac.kopo.shifty.springbootbookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @GetMapping(value = "/all")
    public ModelAndView requestAllBookList() {
        ModelAndView mAV = new ModelAndView();
        mAV.setViewName("books");
        List<Book> bookList = bookService.getAllBookList();
        mAV.addObject("bookList",bookList);
        return mAV;
    }
}

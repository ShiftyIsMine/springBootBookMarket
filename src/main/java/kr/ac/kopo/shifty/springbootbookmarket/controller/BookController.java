package kr.ac.kopo.shifty.springbootbookmarket.controller;

import kr.ac.kopo.shifty.springbootbookmarket.domain.Book;
import kr.ac.kopo.shifty.springbootbookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    @GetMapping("/filter/{bookFilter}")
    public String requestBookByFilter(@MatrixVariable(pathVar = "bookFilter")Map<String, List<String>> bookFilter, Model model) {
        Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
        model.addAttribute("bookList",booksByFilter);
        return "books";
    }

    @GetMapping("/add")
    public String requestAddBookForm(){
        return "addBook";
    }

    @PostMapping("/add")
    public String requestAddBook(@ModelAttribute("book") Book book) {
        bookService.setNewBook(book);
        return "redirect:/books";
    }
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("addTitle", "등록등록ㅇㅇ");
    }
    //데이터 연결 초기화 initbinder
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("bookId","name","author","unitPrice","description","publisher","category","unitInStock","releaseDate","condition");
    }
}

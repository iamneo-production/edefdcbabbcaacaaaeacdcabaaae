package com.book.boodetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @GetMapping("/")
    public String getBooks(){
        return "All books";
    }
}

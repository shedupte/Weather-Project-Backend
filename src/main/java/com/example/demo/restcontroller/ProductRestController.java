package com.example.demo.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductRestController {
    @GetMapping("/weather/")
    public List<Product> getProducts(){
        // call product repo 
    }
}

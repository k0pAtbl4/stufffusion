package com.online_store.demo.web;

import com.online_store.demo.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String homePage();

    @GetMapping("/profile")
    @ResponseStatus(HttpStatus.OK)
    public String profilePage();

    @GetMapping("/addProduct")
    @ResponseStatus(HttpStatus.OK)
    public void addProduct(@RequestBody Product p);
}

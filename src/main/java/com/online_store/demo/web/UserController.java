package com.online_store.demo.web;

import com.online_store.demo.entity.Product;
import com.online_store.demo.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public interface UserController {
    @GetMapping("/")
    public String homePage();

    @GetMapping("/profile")
    @ResponseStatus(HttpStatus.OK)
    public String profilePage();

    @GetMapping("/add-product")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.OK)
    public String addProduct();

    @PostMapping("/add-user")
    public String addUser(@RequestBody User user);
}

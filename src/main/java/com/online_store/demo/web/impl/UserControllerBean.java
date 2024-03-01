package com.online_store.demo.web.impl;

import com.online_store.demo.entity.Product;
import com.online_store.demo.entity.User;
import com.online_store.demo.service.ProductService;
import com.online_store.demo.service.UserService;
import com.online_store.demo.web.UserController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class UserControllerBean implements UserController {

    private final ProductService productService;
    private final UserService userService;

    @Override
    public String homePage() {
        return "index.html";
    }

    @Override
    public String profilePage() {
        return "This is your profile";
    }

    @Override
    public String addProduct() {
        return "Here you can add a product";
    }

    @Override
    public String addUser(User user) {
        userService.create(user);
        return "User created";
    }
}

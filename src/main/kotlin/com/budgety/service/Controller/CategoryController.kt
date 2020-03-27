package com.budgety.service.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/category")
public class CategoryController{

    @GetMapping
    fun getCategory(): String{
        return "Hello"
    }
}
package com.example.demo.controller

import com.example.demo.service.PostsService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/home")
class PostsController(private val postsService: PostsService) {
    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("posts", postsService.findAll())
        return "posts-index"
    }
}
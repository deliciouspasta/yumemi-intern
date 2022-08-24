package com.example.demo.controller

import com.example.demo.domain.Posts
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
        println(postsService.findAll())
        postsService.findAll().forEach{i->
            println(i)
            println(i.javaClass.name)
        }
        return "postsindex"
    }
}
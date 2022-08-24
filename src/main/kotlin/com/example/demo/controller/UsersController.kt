package com.example.demo.controller

import com.example.demo.domain.Users
import com.example.demo.service.UsersService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/users")
class UsersController(private val usersService: UsersService) {
    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("users", usersService.findAll())
        println(usersService.findAll())
        usersService.findAll().forEach{i->
            println(i)
            println(i.javaClass.name)
        }
        return "index"
    }
}
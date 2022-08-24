package com.example.demo.service


import org.springframework.stereotype.Service
import com.example.demo.domain.Posts
import com.example.demo.repository.PostsRepository

@Service
class PostsService(private val postsRepository: PostsRepository) {
    fun findAll() = postsRepository.findAll()
}
package com.example.demo.repository

import com.example.demo.domain.Posts
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostsRepository : JpaRepository<Posts, Int> {

}
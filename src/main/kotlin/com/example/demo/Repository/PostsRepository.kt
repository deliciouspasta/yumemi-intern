package com.example.demo.Repository

import com.example.demo.database.PostsDynamicSqlSupport


interface PostsRepository {
    fun find(userId: Int): PostsDynamicSqlSupport.Posts?
    fun find(text: String): PostsDynamicSqlSupport.Posts?
}
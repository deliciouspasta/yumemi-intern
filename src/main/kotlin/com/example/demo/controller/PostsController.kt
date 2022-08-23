package com.example.demo.controller

import com.example.demo.database.*
import org.mybatis.dynamic.sql.SqlBuilder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Suppress("SpringJavaInjectionPointsAutowiringInspection")
//@RestController
@Controller
@RequestMapping("posts")
class PostsController(
    val postsMapper: PostsMapper
) {
    @GetMapping("/select/{postId}")
    fun select(@PathVariable("postId") postId: Int): PostsRecord? {
        return postsMapper.selectByPrimaryKey(postId)
    }

//    @GetMapping("/home")
//    fun selectAll(): List<PostsRecord> {
//        return postsMapper.select {
//            where(PostsDynamicSqlSupport.Posts.postId, SqlBuilder.isNotEqualTo(-1))
//        }
//    }

    @GetMapping("/home")
    fun selectAll(model: Model): String{
        val result =  postsMapper.select {
            where(PostsDynamicSqlSupport.Posts.postId, SqlBuilder.isNotEqualTo(-1))
        }
        model.addAttribute("modelList", result)
        return "home"
    }

}

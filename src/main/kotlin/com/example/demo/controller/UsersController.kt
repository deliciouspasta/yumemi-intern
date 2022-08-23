package com.example.demo.controller

import com.example.demo.database.*
import com.example.demo.database.UsersDynamicSqlSupport.Users.userId
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.SqlBuilder.isNotEqualTo
import org.springframework.web.bind.annotation.*
import org.springframework.ui.Model

@Suppress("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("users")
class UsersController(
    val usersMapper: UsersMapper
) {
    @GetMapping("/select/{userId}")
    fun select(@PathVariable("userId") userId: Int): UsersRecord? {
        return usersMapper.selectByPrimaryKey(userId)
    }

    @GetMapping("/home")
    fun selectAll(): List<UsersRecord> {
        val result = usersMapper.select {
            where(userId, isNotEqualTo(-1))
        }
        return result
    }

//    @PostMapping("/insert")
//    fun insert(@RequestBody request: InsertRequest): InsertResponse {
//        val record = UsersRecord(request.userId,request.loginId, request.displayName, request.email, request.password, request.createdAt)
//        return InsertResponse(usersMapper.insert(record))
//    }
}

data class InsertRequest(val userId: Int, val loginId: String, val displayName: String, val email: String, val password: String, val createdAt: String)

data class InsertResponse(val count: Int)
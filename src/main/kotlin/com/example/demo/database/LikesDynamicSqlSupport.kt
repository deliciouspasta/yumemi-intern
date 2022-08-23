/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.demo.database

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.SqlTable

object LikesDynamicSqlSupport {
    object Likes : SqlTable("likes") {
        val userId = column<Int>("user_id", JDBCType.INTEGER)

        val postId = column<Int>("post_id", JDBCType.INTEGER)

        val createdAt = column<Date>("created_at", JDBCType.TIMESTAMP)
    }
}
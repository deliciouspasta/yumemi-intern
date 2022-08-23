/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.demo.database

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.SqlTable

object UsersDynamicSqlSupport {
    object Users : SqlTable("users") {
        val userId = column<Int>("user_id", JDBCType.INTEGER)

        val loginId = column<String>("login_id", JDBCType.VARCHAR)

        val displayName = column<String>("display_name", JDBCType.VARCHAR)

        val email = column<String>("email", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)

        val createdAt = column<Date>("created_at", JDBCType.TIMESTAMP)
    }
}
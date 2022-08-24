package com.example.demo.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class Users(
    @Id
    @GeneratedValue
    val userId: Int = 0,

    @Column(name = "login_id")
    val loginId: String = "",

    val displayName: String = "",
    val email: String = "",
    val password: String = "",
    val createdAt: String? = ""
)
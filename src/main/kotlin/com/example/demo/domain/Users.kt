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
    val userId: Int,

    @Column(nullable = false)
    val loginId: String,

    @Column(nullable = false)
    val displayName: String,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val createdAt: String
)
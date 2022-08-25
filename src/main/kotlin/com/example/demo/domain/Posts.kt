package com.example.demo.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.NamedEntityGraph
import javax.persistence.Table

@Entity
@Table(name = "posts")
@NamedEntityGraph(
    name = "users_login_id",
    includeAllAttributes = true
)
data class Posts(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val postId: Int,

    @Column(nullable = false)
    val userId: Int,

    @Column(nullable = false)
    val text: String,

    @Column(nullable = false)
    val createdAt: String
)
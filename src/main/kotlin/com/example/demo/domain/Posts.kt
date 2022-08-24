package com.example.demo.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
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
    @GeneratedValue
    @Column(name = "post_id")
    val postId: Int = 0,

    @Column(name = "user_id")
    val userId: Int = 0,

    val text: String = "",
    val createdAt: String = "",
)
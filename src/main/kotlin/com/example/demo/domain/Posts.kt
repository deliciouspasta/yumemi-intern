package com.example.demo.domain

import lombok.Getter
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
@Getter
@Table(name = "posts")
@NamedEntityGraph(
    name = "users_login_id",
    includeAllAttributes = true
)
data class Posts(
    @Id
    @GeneratedValue
    @Column(name = "post_id")
    val post_id: Int? = null,
    @Column(name = "user_id")
    val user_id: Int? = null,
    val text: String? = null,
    val created_at: String? = null,
)
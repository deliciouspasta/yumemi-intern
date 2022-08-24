package com.example.demo.domain

import lombok.Getter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Getter
@Table(name = "users")
data class Users(
    @Id
    @GeneratedValue
    val user_id: Int? = null,
    @Column(name = "login_id")
    val login_id: String? = null,
    val display_name: String? = null,
    val email: String? = null,
    val password: String? = null,
    val created_at: String? = null
)
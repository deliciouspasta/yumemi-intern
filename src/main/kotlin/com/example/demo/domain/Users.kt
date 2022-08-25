package com.example.demo.domain

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
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
    val userId: Int? = null,

    @Column(nullable = false)
    val loginId: String,

    val displayName: String? = null,

    @Column(nullable = false)
    val email: String,

    @get:JvmName("Mypass")
    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val createdAt: String,
):
    UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority>? {
        return AuthorityUtils.createAuthorityList("ROLE_USER")
    }

    override fun isEnabled(): Boolean {
        return true
    }

    override fun getUsername(): String? {
        return this.loginId
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun getPassword(): String? {
        return this.password
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }
}
package com.example.demo.service

import com.example.demo.domain.Users
import com.example.demo.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
open class UsersDetailsService @Autowired constructor(private val usersRepository: UsersRepository) :
    UserDetailsService {

    override fun loadUserByUsername(loginId: String): UserDetails? {
        var loginUser: Users? = usersRepository.findByloginId(loginId)
        return loginUser
    }
}
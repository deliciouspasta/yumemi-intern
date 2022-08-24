package com.example.demo.service


import org.springframework.stereotype.Service
import com.example.demo.domain.Users
import com.example.demo.repository.UsersRepository

@Service
class UsersService(private val usersRepository: UsersRepository) {
    fun findAll() = usersRepository.findAll()
}
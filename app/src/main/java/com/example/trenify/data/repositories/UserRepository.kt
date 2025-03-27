package com.example.trenify.data.repositories

import com.example.trenify.data.dao.UserDao
import com.example.trenify.data.entities.UserEntity
import com.example.trenify.domain.models.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDao: UserDao
) {
    suspend fun getAllUsers() : Flow<List<User>> {

    }
}
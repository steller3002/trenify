package com.example.trenify.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.trenify.data.entities.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAll(): Flow<List<UserEntity>>
}
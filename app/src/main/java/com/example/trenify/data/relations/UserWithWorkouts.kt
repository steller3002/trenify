package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.UserEntity
import com.example.trenify.data.entities.WorkoutEntity

data class UserWithWorkouts(
    @Embedded val user: UserEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "user_id"
    )
    val workouts: List<WorkoutEntity>
)

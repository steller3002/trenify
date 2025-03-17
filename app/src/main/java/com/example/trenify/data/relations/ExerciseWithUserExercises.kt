package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.UserExerciseEntity

data class ExerciseWithUserExercises (
    @Embedded val exercise: ExerciseEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "exercise_id"
    )
    val userExercises: List<UserExerciseEntity>
)
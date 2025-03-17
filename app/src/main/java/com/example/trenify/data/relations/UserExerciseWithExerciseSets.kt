package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseSetEntity
import com.example.trenify.data.entities.UserExerciseEntity

data class UserExerciseWithExerciseSets(
    @Embedded val userExercise: UserExerciseEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "user_exercise_id"
    )
    val exerciseSets: List<ExerciseSetEntity>
)

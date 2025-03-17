package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.WorkoutEntity

data class ExerciseWithWorkouts (
    @Embedded val exercise: ExerciseEntity,
    @Relation(
        parentColumn = "exercise_id",
        entityColumn = "workout_id"
    )
    val workouts: List<WorkoutEntity>
)
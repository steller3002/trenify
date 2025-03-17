package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.WorkoutEntity

data class WorkoutWithExercises (
    @Embedded val workout: WorkoutEntity,
    @Relation(
        parentColumn = "workout_id",
        entityColumn = "exercise_id"
    )
    val exercises: List<ExerciseEntity>
)
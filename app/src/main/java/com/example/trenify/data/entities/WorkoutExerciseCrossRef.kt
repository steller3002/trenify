package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_exercise_cross_ref",
    primaryKeys = ["workout_id", "exercise_id"])
data class WorkoutExerciseCrossRef (
    @ColumnInfo(name = "workout_id")
    val workoutId: Long,
    @ColumnInfo(name = "exercise_id")
    val exerciseId: Long,
)
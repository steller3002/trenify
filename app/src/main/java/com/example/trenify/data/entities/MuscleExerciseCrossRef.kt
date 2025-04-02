package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "muscle_exercise_cross_ref",
    primaryKeys = ["muscle_id", "exercise_id"])
data class MuscleExerciseCrossRef (
    @ColumnInfo(name = "muscle_id")
    val muscleId: Long,
    @ColumnInfo(name = "exercise_id")
    val exerciseId: Long,
)
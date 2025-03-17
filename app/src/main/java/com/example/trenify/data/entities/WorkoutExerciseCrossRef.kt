package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "workout_exercise_cross_ref")
data class WorkoutExerciseCrossRef (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "workout_id")
    val workoutId: UUID,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "exercise_id")
    val exerciseId: UUID,
)
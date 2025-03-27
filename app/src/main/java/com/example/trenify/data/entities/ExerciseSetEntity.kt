package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_sets")
data class ExerciseSetEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "number_of_reps") var numberOfReps: Int,
    @ColumnInfo(name = "weight") var weight: Float,
    @ColumnInfo(name = "user_exercise_id") val userExerciseId: Long,
)

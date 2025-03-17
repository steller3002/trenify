package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "exercise_sets")
data class ExerciseSetEntity(
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "number_of_reps") var numberOfReps: Int,
    @ColumnInfo(name = "weight") var weight: Float,
    @ColumnInfo(name = "user_exercise_id") val userExerciseId: UUID,
)

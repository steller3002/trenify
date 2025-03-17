package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "muscle_exercise_cross_ref")
data class MuscleExerciseCrossRef (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "muscle_id")
    val muscleId: UUID,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "exercise_id")
    val exerciseId: UUID,
)
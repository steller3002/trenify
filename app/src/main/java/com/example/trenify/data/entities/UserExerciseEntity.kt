package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "user_exercises")
data class UserExerciseEntity(
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "exercise_id") val exerciseId: UUID,
    @ColumnInfo(name = "number_of_sets") val numberOfSets: Int,
)

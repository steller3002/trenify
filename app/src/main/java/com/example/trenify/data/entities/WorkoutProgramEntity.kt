package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "workout_programs")
data class WorkoutProgramEntity (
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "user_id") val userId: UUID
)
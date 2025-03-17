package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

@Entity(tableName = "workouts")
data class WorkoutEntity(
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "date") val date: Date?,
    @ColumnInfo(name = "user_id") val userId: UUID,
)

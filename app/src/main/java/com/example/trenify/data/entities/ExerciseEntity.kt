package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "exercises")
data class ExerciseEntity (
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "target_muscle_group_id") val targetMuscleGroupId: UUID,
)
package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "muscles")
data class MuscleEntity (
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "muscle_group_id") val muscleGroupId: UUID
)
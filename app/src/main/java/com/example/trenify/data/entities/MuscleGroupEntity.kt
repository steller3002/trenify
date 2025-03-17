package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "muscle_groups")
data class MuscleGroupEntity (
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "name") val name: String,
)
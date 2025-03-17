package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "periodization_programs")
data class PeriodizationProgramEntity (
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "number_of_phases") val numberOfPhases: Int,
)
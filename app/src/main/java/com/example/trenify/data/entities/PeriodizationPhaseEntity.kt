package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "periodization_phases")
data class PeriodizationPhaseEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "periodization_id") val periodizationId: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "duration_in_days") val durationInDays: Int
)

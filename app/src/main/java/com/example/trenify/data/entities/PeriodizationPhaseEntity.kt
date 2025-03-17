package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "periodization_phases")
data class PeriodizationPhaseEntity(
    @PrimaryKey(autoGenerate = true) val id: UUID,
    @ColumnInfo(name = "periodization_id") val periodizationId: UUID,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "duration_in_days") val durationInDays: Int
)

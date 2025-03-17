package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.PeriodizationProgramEntity
import com.example.trenify.data.entities.PeriodizationPhaseEntity

data class PeriodizationWithPeriodizationPhase (
    @Embedded val periodization: PeriodizationProgramEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "periodization_id"
    )
    var periodizationPhases: List<PeriodizationPhaseEntity>
)
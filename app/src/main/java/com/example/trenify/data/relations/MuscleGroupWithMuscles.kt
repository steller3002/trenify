package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.MuscleEntity
import com.example.trenify.data.entities.MuscleGroupEntity

data class MuscleGroupWithMuscles (
    @Embedded val muscleGroup: MuscleGroupEntity,
    @Relation(
        parentColumn =  "id",
        entityColumn = "muscle_group_id"
    )
    val muscles: List<MuscleEntity>
)
package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.MuscleGroupEntity

data class MuscleGroupWithExercises (
    @Embedded val muscleGroup: MuscleGroupEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "target_muscle_group_id"
    )
    val exercises: List<ExerciseEntity>
)
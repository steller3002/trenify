package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.MuscleEntity
import com.example.trenify.data.entities.MuscleExerciseCrossRef

data class ExerciseWithMuscles (
    @Embedded val exercise: ExerciseEntity,
    @Relation(
        parentColumn = "exercise_id",
        entityColumn = "muscle_id",
        associateBy = Junction(MuscleExerciseCrossRef::class)
    )
    val muscles: List<MuscleEntity>
)
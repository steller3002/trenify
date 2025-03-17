package com.example.trenify.data.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.MuscleEntity
import com.example.trenify.data.entities.MuscleExerciseCrossRef

data class MuscleWithExercises(
    @Embedded val muscle: MuscleEntity,
    @Relation(
        parentColumn = "muscle_id",
        entityColumn = "exercise_id",
        associateBy = Junction(MuscleExerciseCrossRef::class)
    )
    val exercises: List<ExerciseEntity>
)

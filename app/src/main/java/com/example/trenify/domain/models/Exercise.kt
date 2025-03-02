package com.example.trenify.domain.models

data class Exercise(
    val id: Int,
    val name: String,
    val targetMuscleGroup: MuscleGroup,
    val targetMuscles: List<Muscle>,
)
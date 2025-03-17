package com.example.trenify.domain.models

import java.util.UUID

data class Muscle(
    val id: UUID,
    val name: String,
    val muscleGroup: MuscleGroup,
)
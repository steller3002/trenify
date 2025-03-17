package com.example.trenify.domain.models

import java.util.UUID

data class MuscleGroup(
    val id: UUID,
    val name: String,
    val muscles: List<Muscle>
)

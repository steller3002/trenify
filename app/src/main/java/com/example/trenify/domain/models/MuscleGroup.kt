package com.example.trenify.domain.models

data class MuscleGroup(
    val id: Long,
    val name: String,
    val muscles: List<Muscle>
)

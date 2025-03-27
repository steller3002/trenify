package com.example.trenify.domain.models

import com.example.trenify.domain.enums.Gender

class User(
    val id: Long,
    val username: String,
    val age: Int,
    var weight: Float,
    val gender: Gender,
    var needSeparateDaysForCardio: Boolean,
    var workoutProgram: WorkoutProgram,
    var periodizationProgram: PeriodizationProgram,
    var currentPeriodizationStep: PeriodizationStep,
)
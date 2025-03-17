package com.example.trenify.domain.models

import com.example.trenify.domain.enums.Gender

class FemaleUserAccount(
    id: Long,
    _username: String,
    _age: Int,
    _weight: Float,
    needSeparateDaysForCardio: Boolean,
    workoutProgram: WorkoutProgram,
    periodization: Periodization,
    injuredMuscles: List<Muscle>,
) : UserAccount(
    id, _username,
    Gender.Female,
    _age,
    _weight,
    needSeparateDaysForCardio,
    workoutProgram,
    periodization,
    injuredMuscles
) {
    private var _currentDayOfMenstruation: Int = 0

    fun increaseTheCurrentDayOfMenstruation() {
        _currentDayOfMenstruation++
    }

    fun markTheFirstDayOfMenstruation() {
        _currentDayOfMenstruation = 1
    }

    fun markTheLastDayOfMenstruation() {
        _currentDayOfMenstruation = 0
    }
}
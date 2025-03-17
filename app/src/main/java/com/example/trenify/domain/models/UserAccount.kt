package com.example.trenify.domain.models

import com.example.trenify.domain.enums.Gender
import java.util.UUID

open class UserAccount(
    private var _username: String,
    val gender: Gender,
    private var _age: Int,
    private var _weight: Float,
    var needSeparateDaysForCardio: Boolean,
    var workoutProgram: WorkoutProgram,
    var periodization: Periodization? = null,
    var currentPeriodizationStep: Int? = null
) {
    val id: UUID = UUID.randomUUID()
    var currentWorkout: Workout? = null

    private val _injuredMuscles: MutableList<Muscle> = mutableListOf()
    val injuredMuscles: List<Muscle>
        get() = _injuredMuscles.toList()

    private val _trainingHistory: MutableList<Workout> = mutableListOf()
    val trainingHistory: List<Workout>
        get() = _trainingHistory.toList()

    var username: String
        get() = _username
        set(value) {
            require(value.isNotBlank()) { "Username cannot be blank" }
        }

    var age: Int
        get() = _age
        set(value) {
            require(value > 0) { "Age must be positive" }
            _age = value
        }

    var weight: Float
        get() = _weight
        set(value) {
            require(value > 0) { "Weight must be positive" }
            _weight = value
        }

    fun addWorkoutToHistory(workout: Workout) {
        _trainingHistory.add(workout)
    }

    fun addInjuredMuscle(muscle: Muscle) {
        if (!injuredMuscles.contains(muscle)) {
            _injuredMuscles.add(muscle)
        }
    }
}
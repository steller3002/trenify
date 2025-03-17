package com.example.trenify.domain.models

class WorkoutExercise(
    var exercise: Exercise,
    private var _weight: Float,
    private var _repeats: Int,
) {
    var weight: Float
        get() = _weight
        set(value) {
            require(value > 0)
            _weight = value
        }

    var repeats: Int
        get() = _repeats
        set(value) {
            require(value > 0)
            _repeats = value
        }
}
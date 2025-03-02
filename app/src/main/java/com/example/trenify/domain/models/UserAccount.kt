package com.example.trenify.domain.models

import com.example.trenify.domain.enums.Gender
import com.example.trenify.domain.enums.Periodization
import com.example.trenify.domain.enums.TrainingProgram

open class UserAccount(
    val Id: Long,
    private var _username: String,
    val gender: Gender,
    private var _age: Int,
    private var _weight: Float,
    var needSeparateDaysForCardio: Boolean,
    var trainingProgram: TrainingProgram,
    var periodization: Periodization,
    val injuredMuscles: List<Muscle>,
) {
    var username: String
        get() = _username
        set(value) {
            require(value.isNotBlank())
        }

    var age: Int
        get() = _age
        set(value) {
            require(value > 0)
            _age = value
        }

    var weight: Float
        get() = _weight
        set(value) {
            require(weight > 0)
            _weight = value
        }
}
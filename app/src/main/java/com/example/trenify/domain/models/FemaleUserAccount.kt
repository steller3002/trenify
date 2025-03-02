package com.example.trenify.domain.models

import com.example.trenify.domain.enums.Gender
import com.example.trenify.domain.enums.Periodization
import com.example.trenify.domain.enums.TrainingProgram

class FemaleUserAccount(
    Id: Long,
    _username: String,
    _age: Int,
    _weight: Float,
    needSeparateDaysForCardio: Boolean,
    trainingProgram: TrainingProgram,
    periodization: Periodization,
    injuredMuscles: List<Muscle>
) : UserAccount(
    Id, _username,
    Gender.Female,
    _age,
    _weight, needSeparateDaysForCardio, trainingProgram, periodization, injuredMuscles
)
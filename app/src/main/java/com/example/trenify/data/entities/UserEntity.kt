package com.example.trenify.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.trenify.domain.enums.Gender

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "username") var username: String,
    @ColumnInfo(name = "age") var age: Int,
    @ColumnInfo(name = "weight") var weight: Float,
    @ColumnInfo(name = "gender") val gender: Gender,

    // Special for female:
    @ColumnInfo(name = "current_day_of_menstruation") var currentDayOfMenstruation: Int?,

    @ColumnInfo(name = "need_separate_cardio") var needSeparateDaysForCardio: Boolean,
    @ColumnInfo(name = "workout_program_id") var workoutProgramId: Long,
    @ColumnInfo(name = "periodization_program_id") var periodizationProgramId: Long,
    @ColumnInfo(name = "current_periodization_step") var currentPeriodizationStepId: Long,
)
package com.example.trenify.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.trenify.data.dao.UserDao
import com.example.trenify.data.entities.ExerciseEntity
import com.example.trenify.data.entities.ExerciseSetEntity
import com.example.trenify.data.entities.MuscleEntity
import com.example.trenify.data.entities.MuscleExerciseCrossRef
import com.example.trenify.data.entities.MuscleGroupEntity
import com.example.trenify.data.entities.PeriodizationPhaseEntity
import com.example.trenify.data.entities.PeriodizationProgramEntity
import com.example.trenify.data.entities.UserEntity
import com.example.trenify.data.entities.UserExerciseEntity
import com.example.trenify.data.entities.WorkoutEntity
import com.example.trenify.data.entities.WorkoutExerciseCrossRef
import com.example.trenify.data.entities.WorkoutProgramEntity
import com.example.trenify.data.typeConverters.DateConverter
import kotlin.concurrent.Volatile

@Database(
    entities = [
        ExerciseEntity::class,
        ExerciseSetEntity::class,
        MuscleEntity::class,
        MuscleExerciseCrossRef::class,
        MuscleGroupEntity::class,
        PeriodizationPhaseEntity::class,
        PeriodizationProgramEntity::class,
        UserEntity::class,
        UserExerciseEntity::class,
        WorkoutEntity::class,
        WorkoutExerciseCrossRef::class,
        WorkoutProgramEntity::class,
    ],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = createDatabase(context)
                INSTANCE = instance
                instance
            }
        }

        private fun createDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "app_database.db"
            ).build()
        }
    }
}
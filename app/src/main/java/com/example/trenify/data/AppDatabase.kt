package com.example.trenify.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.trenify.data.typeConverters.DateConverter

@Database(
    entities = [
        //TODO:
        // add entities
    ],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        fun createDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "app_database.db"
            ).build()
        }
    }
}
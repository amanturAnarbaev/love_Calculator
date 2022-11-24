package com.example.lovecalculator

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [CalculateModel::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun getDao():CalculateDao

}
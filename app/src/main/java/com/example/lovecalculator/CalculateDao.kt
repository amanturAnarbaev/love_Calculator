package com.example.lovecalculator

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface CalculateDao {
    @Insert
    fun insert(calculateModel: CalculateModel)

    @Query("SELECT * FROM `calculate - history`")
    fun getAll():LiveData<MutableList<CalculateModel>>
}
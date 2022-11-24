package com.example.lovecalculator

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "calculate - History")
data class CalculateModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,


    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String
)

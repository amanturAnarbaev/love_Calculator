package com.example.lovecalculator

import com.google.gson.annotations.SerializedName

data class CalculateModel(
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String
)

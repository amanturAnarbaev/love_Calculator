package com.example.lovecalculator

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

//.url("https://love-calculator.p.rapidapi.com/getPercentage?sname=Alice&fname=John")
//.get()
//.addHeader("X-RapidAPI-Key", "d376098a99msh49b18e1f93f20cbp1d5062jsn869e6323a2f5")
//.addHeader("X-RapidAPI-Host", "love-calculator.p.rapidapi.com")
//.build()


interface CalculatorApi {
    @GET("getPercentage")
    fun getPercentage(
        @Query("sname") secondName: String,
        @Query("fname") firstName: String,
        @Header("X-RapidAPI-Key") key: String = "d376098a99msh49b18e1f93f20cbp1d5062jsn869e6323a2f5",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"

    ): Call<CalculateModel>
}
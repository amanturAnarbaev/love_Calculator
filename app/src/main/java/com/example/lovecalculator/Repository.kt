package com.example.lovecalculator

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    fun getRequest(firsrName : String, secondName : String): MutableLiveData<CalculateModel>{
        val  calculateLiveData =MutableLiveData<CalculateModel>()
        App.api.getPercentage(firsrName,secondName).enqueue(
            object : Callback<CalculateModel>{
                override fun onResponse(
                    call: Call<CalculateModel>,
                    response: Response<CalculateModel>
                ) {
                    if(response.isSuccessful){
                        calculateLiveData.postValue(response.body())

                    }
                }

                override fun onFailure(call: Call<CalculateModel>, t: Throwable) {

                }

            } )
        return calculateLiveData

    }
}
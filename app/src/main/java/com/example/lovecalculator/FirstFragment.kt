package com.example.lovecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator.databinding.FragmentFirstBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    private val viewModel:MainActivityViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCalculste.setOnClickListener {
            getRequest()


        }

    }
    @SuppressLint("FragmentLiveDataObserve")
    private fun getRequest() {

        binding.btnCalculste.setOnClickListener {
            viewModel.getRequest(binding.edEText1.text.toString(), binding.edEText2.text.toString())
                .observe(this@FirstFragment) {

                    findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(it.firstName,it.secondName,
                    it.result,it.percentage))

                }

        }
    }


 }

//    private fun getRequest() {
//        App.api.getPercentage(binding.edEText1.text.toString(),binding.edEText2.text.toString()).enqueue(
//            object : Callback<CalculateModel>{
//                override fun onResponse(
//                    call: Call<CalculateModel>,
//                    response: Response<CalculateModel>
//                ) {
//                    findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(response.body()?.firstName.toString(),
//                    response.body()?.secondName.toString(),response.body()?.result.toString(),response.body()?.percentage.toString()))
//
//
//                }
//
//                override fun onFailure(call: Call<CalculateModel>, t: Throwable) {
//                    TODO("Not yet implemented")
//                }
//
//            }
//        )
//
//
//    }
//
//
//}



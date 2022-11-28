package com.example.lovecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    private lateinit var navGraphArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navGraphArgs = SecondFragmentArgs.fromBundle(it)
        }
        binding.score.text = navGraphArgs.score

        binding.Fname.text = navGraphArgs.fname
        binding.Sname.text = navGraphArgs.sname
        binding.percent.text = navGraphArgs.percentage



        binding.btnAgain.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToFirstFragment())
        }
        binding.imageHome.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToHistoryFragment())
        }
    }

    


}
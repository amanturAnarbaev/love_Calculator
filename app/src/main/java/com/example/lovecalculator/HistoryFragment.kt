package com.example.lovecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private val viewModel: MainActivityViewModel by viewModels()

    private lateinit var binding: FragmentHistoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        App.appDataBase.getDao().getAll().observe(viewLifecycleOwner) {
            val list = ArrayList<CalculateModel>()
            val adapter = AdaapterHistory(list)
            binding.recycleHistory.adapter = adapter






        }
    }





}
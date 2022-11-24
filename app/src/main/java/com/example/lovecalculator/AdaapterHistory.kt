package com.example.lovecalculator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.lovecalculator.databinding.ItemHistoryBinding

class AdaapterHistory(private val list: ArrayList<HistoryModel>) :
    RecyclerView.Adapter<AdaapterHistory.HistoryViewHolder>() {
    inner class HistoryViewHolder(private val binding: ItemHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(historyModel: HistoryModel) {
            binding.firstNHistory.text = historyModel.firstName
            binding.secondNHistory.text = historyModel.secondName
            binding.percentHistory.text = historyModel.perecenyage.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            ItemHistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
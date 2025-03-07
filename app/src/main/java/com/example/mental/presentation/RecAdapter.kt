package com.example.mental.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mental.databinding.ItemrecyleBinding

class RecAdapter(var list: List<String>):RecyclerView.Adapter<RecAdapter.VH>(){
    inner class VH( var itemRecyclerBinding: ItemrecyleBinding):RecyclerView.ViewHolder(itemRecyclerBinding.root){
        fun binding(text:String){
            itemRecyclerBinding.textbosqichid.text=text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemrecyleBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int =list.size



    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding(list[position])
    }

}
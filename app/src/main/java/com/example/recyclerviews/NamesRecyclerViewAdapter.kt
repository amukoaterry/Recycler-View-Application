package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.w3c.dom.NameList

class NamesRecyclerViewAdapter (var namesList: List<String>):
RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        val viewHolder=NamesViewHolder(itemView)
        return viewHolder
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvName.text = namesList[position]
    }

    override fun getItemCount(): Int {
        return namesList.size
    }
}

class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
   var tvName = itemView.findViewById<TextView>(R.id.tvName)
}
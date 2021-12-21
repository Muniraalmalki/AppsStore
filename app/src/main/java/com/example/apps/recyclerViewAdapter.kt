package com.example.apps

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apps.databinding.ItemRowBinding
import com.squareup.picasso.Picasso

class RecyclerViewAdapter(private var appList:ArrayList<TopApp>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding:ItemRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return  ItemViewHolder(ItemRowBinding.inflate(LayoutInflater.from(parent.context)
            , parent,
            false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val appTop = appList[position]
        holder.binding.apply {
            title.text = appTop.title
       Picasso.get().load(appTop.image).into(image)

        }
    }

    override fun getItemCount(): Int {
        return appList.size
    }

}
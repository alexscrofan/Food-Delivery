package com.example.licenta_food_ordering.adaptar

import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.licenta_food_ordering.databinding.PopulerItemBinding

class PopularAddaptar (private val items:List<String>, private val price:List<String>, private val image:List<Int>) : RecyclerView.Adapter<PopularAddaptar.PopulerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
        return PopulerViewHolder(PopulerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item, price, images)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopulerViewHolder (private val binding: PopulerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imagesView = binding.imageView6
        fun bind(item: String, price: String, images: Int) {
            binding.FoodNamePopuler.text = item
            binding.PricePopuler.text = price
            imagesView.setImageResource(images)
        }

    }
}
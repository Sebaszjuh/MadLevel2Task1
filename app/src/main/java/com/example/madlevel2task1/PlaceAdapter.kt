package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter(private val reminders: List<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place) {
            binding.imageView.setImageResource(place.imageResId)
            binding.textView.text = place.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(reminders[position])
    }

    override fun getItemCount(): Int {
        return reminders.size
    }

}
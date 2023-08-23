package com.example.hw2_month6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw2_month6.databinding.ItemPhotoBinding

class SelectAdapter(private val list: ArrayList<Photo>) :
    RecyclerView.Adapter<SelectAdapter.SelectedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectedViewHolder {
        return SelectedViewHolder(
            ItemPhotoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SelectedViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    inner class SelectedViewHolder(private val binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: Photo) {
            Glide.with(binding.ivPhoto).load(photo.photo).into(binding.ivPhoto)
        }
    }
}
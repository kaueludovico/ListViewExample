package com.zallpy.listviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.zallpy.listviewexample.databinding.ResListItemBinding

class ItemAdapter(context: Context, private val items: List<Items>) : ArrayAdapter<Items>(context, 0, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ResListItemBinding = convertView?.let {
            ResListItemBinding.bind(it)
        } ?: run {
            ResListItemBinding.inflate(LayoutInflater.from(context), parent, false)
        }

        val currentItem = items[position]

        binding.imageView.setImageResource(currentItem.imageResId)
        binding.titleTextView.text = currentItem.title
        binding.descriptionTextView.text = currentItem.description

        return binding.root
    }
}
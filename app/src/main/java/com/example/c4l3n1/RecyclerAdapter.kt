package com.example.c4l3n1

import android.R.attr.button
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.c4l3n1.databinding.RecyclerViewItemBinding


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.Holder>(){

    private lateinit var items : List<RecyclerModel>

    class Holder(item: View) : RecyclerView.ViewHolder(item)
    {
        private val binding = RecyclerViewItemBinding.bind(item)
        fun bind(recyclerModel: RecyclerModel) = with(binding){
            rvTv.text = recyclerModel.text
            but.text = if (recyclerModel.mOnline) "Message" else "Offline"
            but.isEnabled = recyclerModel.mOnline
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        return Holder(
            inflater.inflate(R.layout.recycler_view_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(
            items[position]
        )
    }
}
package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myRecyclerViewAdapter : RecyclerView.Adapter<viewHolder>() {
    val imageList = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return viewHolder(listItem)
    }

    override fun getItemCount(): Int{
        return imageList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.textView.text = "Product No.${position+1}"
        holder.image.setImageResource(imageList[position])
    }
}

class viewHolder(val view: View) : RecyclerView.ViewHolder(view){
    val textView = view.findViewById<TextView>(R.id.product)
    val image = view.findViewById<ImageView>(R.id.image)
}


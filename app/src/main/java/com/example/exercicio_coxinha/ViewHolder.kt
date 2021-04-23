package com.example.exercicio_coxinha

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_item.view.*

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(foods: Foods) = with(itemView){
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvValue = findViewById<TextView>(R.id.tvValue)

        Glide.with(itemView.context).load(foods.image).into(ivFoods)

        tvName.text = foods.name
        tvValue.text = foods.value.toString()
    }
}
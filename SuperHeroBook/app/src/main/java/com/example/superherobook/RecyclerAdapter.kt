package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    val superHeroList: ArrayList<String>,
    val superHeroBitmap: ArrayList<Int>
) : RecyclerView.Adapter<RecyclerAdapter.SuperHeroVH>() {
    class SuperHeroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return SuperHeroVH(itemView)
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.recyclerViewTextView).text =
            superHeroList.get(position)
        holder.itemView.setOnClickListener{
             val intent=Intent(holder.itemView.context,DisplayActivity::class.java)
            intent.putExtra("superHeroName",superHeroList.get(position))
            intent.putExtra("superHeroVisual",superHeroBitmap.get(position))
            /*
            val singleton=SingletonClass.selectHero
            singleton.visual=SuperHeroBitmap.get(position)
            */
            holder.itemView.context.startActivity(intent)
        }
    }

}
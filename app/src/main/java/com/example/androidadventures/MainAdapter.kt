package com.example.androidadventures

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class MainAdapter(private val dataset: List<String>):
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(val view: MaterialCardView) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_card, parent, false) as MaterialCardView

        return MainViewHolder(cardView)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val text: TextView = holder.view.findViewById(R.id.card_textview)
        holder.view.setOnClickListener {
            val context = it.context
            val intent = Intent(context, BottomBarActivity::class.java)
            context.startActivity(intent)
        }
        text.text = dataset[position]
    }

}
package com.example.hackathon_30_11.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.hackathon_30_11.R
import com.example.hackathon_30_11.helpers.AsyncPhotoLoader
import com.example.hackathon_30_11.model.TrustLevel
import com.example.hackathon_30_11.model.Worker
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class WorkerListAdapter(private val workers: List<Worker>, val btnClick: (workerId: Int) -> Unit): RecyclerView.Adapter<WorkerListAdapter.ViewHolder>() {

    class ViewHolder(private val view: View, private val btnClick: (workerId: Int) -> Unit): RecyclerView.ViewHolder(view) {
        fun bind(worker: Worker) {
            val name: TextView = view.findViewById<TextView>(R.id.workerNameInList)
            val company: TextView = view.findViewById<TextView>(R.id.workerCompany)
            val photo: ImageView = view.findViewById<ImageView>(R.id.workerPhoto)
            val card: MaterialCardView = view.findViewById(R.id.workerCard)
            val trustSmile: ImageView = view.findViewById(R.id.trustImage)
            val detailBtn: MaterialButton = view.findViewById(R.id.workerDetailsBtn)

            name.text = "${worker.name}, ${worker.age}"
            company.text = worker.company
            val photoLoader = AsyncPhotoLoader()
            photoLoader.load(worker.photoUrl, photo)
            when (worker.trustLevel) {
                TrustLevel.TRUST_GREAT -> {
                    card.setCardBackgroundColor(view.resources.getColor(R.color.trustLevelGreat, null))
                    trustSmile.setImageDrawable(ResourcesCompat.getDrawable(view.resources, R.drawable.sentiment_very_satisfied, null))
                }
                TrustLevel.TRUST_GOOD -> {
                    card.setCardBackgroundColor(view.resources.getColor(R.color.trustLevelGood, null))
                    trustSmile.setImageDrawable(ResourcesCompat.getDrawable(view.resources, R.drawable.sentiment_satisfied, null))
                }
                TrustLevel.TRUST_BAD -> {
                    card.setCardBackgroundColor(view.resources.getColor(R.color.trustLevelBad, null))
                    trustSmile.setImageDrawable(ResourcesCompat.getDrawable(view.resources, R.drawable.mood_bad, null))
                }
                else -> {}
            }
            detailBtn.setOnClickListener{_ -> btnClick(worker.id)}
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.worker_list_item, parent, false)
        return ViewHolder(view, btnClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(workers.get(position))
    }

    override fun getItemCount(): Int {
        return workers.size
    }
}
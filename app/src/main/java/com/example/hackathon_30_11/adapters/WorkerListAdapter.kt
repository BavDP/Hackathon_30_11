package com.example.hackathon_30_11.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hackathon_30_11.R
import com.example.hackathon_30_11.model.Worker

class WorkerListAdapter(val workers: List<Worker>): RecyclerView.Adapter<WorkerListAdapter.ViewHolder>() {

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        public fun bind(worker: Worker) {
            val name: TextView = view.findViewById<TextView>(R.id.workerNameInList)
            name.text = worker.name
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WorkerListAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.worker_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: WorkerListAdapter.ViewHolder, position: Int) {
        holder.bind(workers.get(position))
    }

    override fun getItemCount(): Int {
        return workers.size
    }
}
package com.example.hackathon_30_11.mvp.workerList

import com.example.hackathon_30_11.model.Worker

interface WorkerListContract {
    interface View {
        fun showWorkerList(list: List<Worker>)
    }

    interface Model {
        fun loadWorkerList(userLogin: String): List<Worker>
    }

    interface Represent {
        fun getWorkerList(userLogin: String)
    }
}
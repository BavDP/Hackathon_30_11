package com.example.hackathon_30_11.mvp.workerDetail

import com.example.hackathon_30_11.model.Worker

interface WorkerDetailContract {
    interface Model {
        fun loadWorkerById(workerId: Int): Worker
    }

    interface View {
        fun showDetailOfWorker(worker: Worker)
    }

    interface Represent {
        fun getWorkerById(workerId: Int): Worker
    }
}
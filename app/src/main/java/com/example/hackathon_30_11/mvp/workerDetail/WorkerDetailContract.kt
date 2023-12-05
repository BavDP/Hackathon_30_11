package com.example.hackathon_30_11.mvp.workerDetail

import com.example.hackathon_30_11.model.TrustLevel
import com.example.hackathon_30_11.model.Worker

interface WorkerDetailContract {
    interface Model {
        fun loadWorkerById(workerId: Int): Worker?
        fun saveWorker(saveWorker: Worker)
    }

    interface View {
        fun showDetailsOfWorker(worker: Worker?)
    }

    interface Represent {
        fun getWorkerById(workerId: Int): Worker?
        fun setWorkerTrustLevel(trustLevel: TrustLevel)
        fun saveWorker()
    }
}
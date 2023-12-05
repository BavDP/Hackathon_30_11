package com.example.hackathon_30_11.mvp.workerDetail

import com.example.hackathon_30_11.model.TrustLevel
import com.example.hackathon_30_11.model.Worker

class WorkerDetailRepresent(private val view: WorkerDetailContract.View, private val model: WorkerDetailContract.Model): WorkerDetailContract.Represent {
    private lateinit var bufWorker: Worker
    override fun getWorkerById(workerId: Int): Worker? {
        return model.loadWorkerById(workerId).apply {
            bufWorker = Worker().assign(this)
        }
    }

    override fun setWorkerTrustLevel(trustLevel: TrustLevel) {
        bufWorker.trustLevel = trustLevel
        view.showDetailsOfWorker(bufWorker)
    }

    override fun saveWorker() {
        model.saveWorker(bufWorker)
        view.showDetailsOfWorker(getWorkerById(bufWorker.id).apply {
            bufWorker.assign(this)
        })
    }
}
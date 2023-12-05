package com.example.hackathon_30_11.mvp.workerDetail

import com.example.hackathon_30_11.model.Worker
import com.example.hackathon_30_11.mvp.workerList.WorkerListModel

object WorkerDetailModel: WorkerDetailContract.Model {
    override fun loadWorkerById(workerId: Int): Worker? {
        if (workerId == -1) return null
        val workerList = WorkerListModel.workerList
        return workerList.first {
            it.id == workerId
        }
    }

    override fun saveWorker(saveWorker: Worker) {
        val workerList = WorkerListModel.workerList
        val worker = workerList.first {
            it.id == saveWorker.id
        }
        worker.assign(saveWorker)
    }
}
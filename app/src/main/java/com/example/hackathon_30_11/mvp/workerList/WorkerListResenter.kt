package com.example.hackathon_30_11.mvp.workerList

import com.example.hackathon_30_11.model.Worker

class WorkerListResenter(private val view: WorkerListContract.View, private val model: WorkerListContract.Model): WorkerListContract.Represent {
    override fun getWorkerList(userLogin: String){
        view.showWorkerList(model.loadWorkerList(userLogin))
    }
}
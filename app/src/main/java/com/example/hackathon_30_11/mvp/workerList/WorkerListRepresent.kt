package com.example.hackathon_30_11.mvp.workerList

import com.example.hackathon_30_11.mvp.register.RegisterModel

class WorkerListRepresent(private val view: WorkerListContract.View, private val model: WorkerListContract.Model): WorkerListContract.Represent {
    override fun getWorkerList(userLogin: String){
        view.showWorkerList(model.loadWorkerList(userLogin))
    }

    override fun isUserRegistered(): Boolean {
        return RegisterModel.isUserAuthorized()
    }
}
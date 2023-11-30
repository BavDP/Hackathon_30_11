package com.example.hackathon_30_11.mvp.workerList

import com.example.hackathon_30_11.model.Worker

class WorkerListModel: WorkerListContract.Model {
    override fun loadWorkerList(userLogin: String): List<Worker> {
        return listOf<Worker>(
            Worker("1", 20, "Alex", "m", "Company1", "", ""),
            Worker("1", 20, "Sergey", "m", "Company1", "", ""),
            Worker("1", 20, "Oleg", "m", "Company1", "", ""),
            Worker("1", 20, "Dmytro", "m", "Company1", "", ""),
            Worker("1", 20, "Peter", "m", "Company1", "", ""),
            Worker("1", 20, "Marina", "m", "Company1", "", ""),
            Worker("1", 20, "Oleg", "m", "Company1", "", ""),
            Worker("1", 20, "Stepan", "m", "Company1", "", ""),
            Worker("1", 20, "Roman", "m", "Company1", "", ""),
            Worker("1", 20, "Michail", "m", "Company1", "", ""),
            Worker("1", 20, "Andrei", "m", "Company1", "", ""),
            Worker("1", 20, "Artem", "m", "Company1", "", ""),
            Worker("1", 20, "Oleksander", "m", "Company1", "", ""),
            Worker("1", 20, "Svetlana", "m", "Company1", "", ""),
            Worker("1", 20, "Denis", "m", "Company1", "", ""),
            Worker("1", 20, "Alex", "m", "Company1", "", ""),
            Worker("1", 20, "Sergey", "m", "Company1", "", ""),
            Worker("1", 20, "Oleg", "m", "Company1", "", ""),
            Worker("1", 20, "Dmytro", "m", "Company1", "", ""),
            Worker("1", 20, "Peter", "m", "Company1", "", ""),
            Worker("1", 20, "Marina", "m", "Company1", "", ""),
            Worker("1", 20, "Oleg", "m", "Company1", "", ""),
            Worker("1", 20, "Stepan", "m", "Company1", "", ""),
            Worker("1", 20, "Roman", "m", "Company1", "", ""),
            Worker("1", 20, "Michail", "m", "Company1", "", ""),
            Worker("1", 20, "Andrei", "m", "Company1", "", ""),
            Worker("1", 20, "Artem", "m", "Company1", "", ""),
            Worker("1", 20, "Oleksander", "m", "Company1", "", ""),
            Worker("1", 20, "Svetlana", "m", "Company1", "", ""),
            Worker("1", 20, "Denis", "m", "Company1", "", "")

        )
    }
}
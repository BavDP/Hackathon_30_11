package com.example.hackathon_30_11.mvp.workerList

import com.example.hackathon_30_11.model.TrustLevel
import com.example.hackathon_30_11.model.Worker

object WorkerListModel: WorkerListContract.Model {
        val workerList = listOf<Worker>(
            Worker(1, 21, "Alex", "male", "Company1", "+38(092)455-76-23", "https://randomuser.me/api/portraits/men/3.jpg", TrustLevel.TRUST_GOOD),
            Worker(2, 22, "Sergey", "male", "Company1", "+38(094)123-76-23", "https://randomuser.me/api/portraits/men/48.jpg", TrustLevel.TRUST_GOOD),
            Worker(3, 23, "Oleg", "male", "Company1", "+38(082)255-76-23", "https://randomuser.me/api/portraits/men/45.jpg", TrustLevel.TRUST_GREAT),
            Worker(4, 24, "Dmytro", "male", "Company1", "+38(052)411-72-23", "https://randomuser.me/api/portraits/men/13.jpg", TrustLevel.TRUST_BAD),
            Worker(5, 25, "Peter", "male", "Company1", "+38(090)453-75-23", "https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_BAD),
            Worker(6, 26, "Marina", "female", "Company1", "+38(092)111-76-23", "https://randomuser.me/api/portraits/men/40.jpg", TrustLevel.TRUST_GOOD),
            Worker(7, 27, "Oleg", "male", "Company1", "+38(092)455-11-11", "https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_GOOD),
            Worker(8, 28, "Stepan", "male", "Company1", "+38(092)435-00-23", "https://randomuser.me/api/portraits/men/38.jpg", TrustLevel.TRUST_GREAT),
            Worker(9, 29, "Roman", "male", "Company1", "+38(090)454-77-53", "https://randomuser.me/api/portraits/men/42.jpg", TrustLevel.TRUST_BAD),
            Worker(10, 21, "Michail", "male", "Company1", "+38(092)112-76-23", "https://randomuser.me/api/portraits/men/21.jpg", TrustLevel.TRUST_GOOD),
            Worker(11, 31, "Andrei", "male", "Company1", "+38(090)776-31-23", "https://randomuser.me/api/portraits/men/33.jpg", TrustLevel.TRUST_GOOD),
            Worker(12, 42, "Artem", "male", "Company1", "+38(091)345-88-23", "https://randomuser.me/api/portraits/men/50.jpg", TrustLevel.TRUST_GOOD),
            Worker(13, 52, "Oleksander", "male", "Company1", "+38(090)324-11-23", "https://randomuser.me/api/portraits/men/41.jpg", TrustLevel.TRUST_GREAT),
            Worker(14, 29, "Svetlana", "female", "Company1", "+38(091)348-89-23", "https://randomuser.me/api/portraits/men/23.jpg", TrustLevel.TRUST_GREAT),
            Worker(15, 34, "Denis", "male", "Company1", "+38(090)455-76-54", "https://randomuser.me/api/portraits/men/3.jpg", TrustLevel.TRUST_BAD),
            Worker(16, 44, "Alex", "male", "Company1", "+38(091)344-22-23",  "https://randomuser.me/api/portraits/men/48.jpg", TrustLevel.TRUST_BAD),
            Worker(17, 49, "Sergey", "male", "Company1", "+38(095)554-76-23","https://randomuser.me/api/portraits/men/45.jpg", TrustLevel.TRUST_GOOD),
            Worker(18, 23, "Oleg", "male", "Company1", "+38(094)665-87-53",  "https://randomuser.me/api/portraits/men/13.jpg", TrustLevel.TRUST_BAD),
            Worker(19, 22, "Dmytro", "male", "Company1", "+38(094)675-43-23", "https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_GREAT),
            Worker(20, 20, "Peter", "male", "Company1", "+38(091)234-65-73", "https://randomuser.me/api/portraits/men/40.jpg", TrustLevel.TRUST_GOOD),
            Worker(21, 30, "Marina", "female", "Company1", "+38(091)534-88-44","https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_GOOD),
            Worker(22, 40, "Oleg", "male", "Company1", "+38(091)432-75-52",  "https://randomuser.me/api/portraits/men/38.jpg", TrustLevel.TRUST_GOOD),
            Worker(23, 24, "Stepan", "male", "Company1", "+38(090)433-43-23", "https://randomuser.me/api/portraits/men/42.jpg", TrustLevel.TRUST_GREAT),
            Worker(24, 27, "Roman", "male", "Company1", "+38(090)543-65-23",  "https://randomuser.me/api/portraits/men/21.jpg", TrustLevel.TRUST_BAD),
            Worker(25, 29, "Michail", "male", "Company1", "+38(090)665-00-75", "https://randomuser.me/api/portraits/men/33.jpg", TrustLevel.TRUST_BAD),
            Worker(26, 31, "Andrei", "male", "Company1", "+38(091)432-11-12", "https://randomuser.me/api/portraits/men/50.jpg", TrustLevel.TRUST_BAD),
            Worker(27, 45, "Artem", "male", "Company1", "+38(092)432-76-32",  "https://randomuser.me/api/portraits/men/41.jpg", TrustLevel.TRUST_GOOD),
            Worker(28, 33, "Oleksander", "male", "Company1","+38(091)432-88-22", "https://randomuser.me/api/portraits/men/23.jpg", TrustLevel.TRUST_GOOD)
        )

    override fun loadWorkerList(userLogin: String): List<Worker> {
        return workerList
    }
}
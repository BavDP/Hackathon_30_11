package com.example.hackathon_30_11.mvp.workerList

import com.example.hackathon_30_11.model.TrustLevel
import com.example.hackathon_30_11.model.Worker

class WorkerListModel: WorkerListContract.Model {
    override fun loadWorkerList(userLogin: String): List<Worker> {
        return listOf<Worker>(
            Worker(1, 21, "Alex", "m", "Company1", "", "https://randomuser.me/api/portraits/men/3.jpg", TrustLevel.TRUST_GOOD),
            Worker(2, 22, "Sergey", "m", "Company1", "", "https://randomuser.me/api/portraits/men/48.jpg", TrustLevel.TRUST_GOOD),
            Worker(3, 23, "Oleg", "m", "Company1", "", "https://randomuser.me/api/portraits/men/45.jpg", TrustLevel.TRUST_GREAT),
            Worker(4, 24, "Dmytro", "m", "Company1", "", "https://randomuser.me/api/portraits/men/13.jpg", TrustLevel.TRUST_BAD),
            Worker(5, 25, "Peter", "m", "Company1", "", "https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_BAD),
            Worker(6, 26, "Marina", "m", "Company1", "", "https://randomuser.me/api/portraits/men/40.jpg", TrustLevel.TRUST_GOOD),
            Worker(7, 27, "Oleg", "m", "Company1", "", "https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_GOOD),
            Worker(8, 28, "Stepan", "m", "Company1", "", "https://randomuser.me/api/portraits/men/38.jpg", TrustLevel.TRUST_GREAT),
            Worker(9, 29, "Roman", "m", "Company1", "", "https://randomuser.me/api/portraits/men/42.jpg", TrustLevel.TRUST_BAD),
            Worker(10, 21, "Michail", "m", "Company1", "", "https://randomuser.me/api/portraits/men/21.jpg", TrustLevel.TRUST_GOOD),
            Worker(11, 31, "Andrei", "m", "Company1", "", "https://randomuser.me/api/portraits/men/33.jpg", TrustLevel.TRUST_GOOD),
            Worker(12, 42, "Artem", "m", "Company1", "", "https://randomuser.me/api/portraits/men/50.jpg", TrustLevel.TRUST_GOOD),
            Worker(13, 52, "Oleksander", "m", "Company1", "", "https://randomuser.me/api/portraits/men/41.jpg", TrustLevel.TRUST_GREAT),
            Worker(14, 29, "Svetlana", "m", "Company1", "", "https://randomuser.me/api/portraits/men/23.jpg", TrustLevel.TRUST_GREAT),
            Worker(15, 34, "Denis", "m", "Company1", "", "https://randomuser.me/api/portraits/men/3.jpg", TrustLevel.TRUST_BAD),
            Worker(16, 44, "Alex", "m", "Company1", "",  "https://randomuser.me/api/portraits/men/48.jpg", TrustLevel.TRUST_BAD),
            Worker(17, 49, "Sergey", "m", "Company1", "","https://randomuser.me/api/portraits/men/45.jpg", TrustLevel.TRUST_GOOD),
            Worker(18, 23, "Oleg", "m", "Company1", "",  "https://randomuser.me/api/portraits/men/13.jpg", TrustLevel.TRUST_BAD),
            Worker(19, 22, "Dmytro", "m", "Company1", "", "https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_GREAT),
            Worker(20, 20, "Peter", "m", "Company1", "", "https://randomuser.me/api/portraits/men/40.jpg", TrustLevel.TRUST_GOOD),
            Worker(21, 30, "Marina", "m", "Company1", "","https://randomuser.me/api/portraits/men/43.jpg", TrustLevel.TRUST_GOOD),
            Worker(22, 40, "Oleg", "m", "Company1", "",  "https://randomuser.me/api/portraits/men/38.jpg", TrustLevel.TRUST_GOOD),
            Worker(23, 24, "Stepan", "m", "Company1", "", "https://randomuser.me/api/portraits/men/42.jpg", TrustLevel.TRUST_GREAT),
            Worker(24, 27, "Roman", "m", "Company1", "",  "https://randomuser.me/api/portraits/men/21.jpg", TrustLevel.TRUST_BAD),
            Worker(25, 29, "Michail", "m", "Company1", "", "https://randomuser.me/api/portraits/men/33.jpg", TrustLevel.TRUST_BAD),
            Worker(26, 31, "Andrei", "m", "Company1", "", "https://randomuser.me/api/portraits/men/50.jpg", TrustLevel.TRUST_BAD),
            Worker(27, 45, "Artem", "m", "Company1", "",  "https://randomuser.me/api/portraits/men/41.jpg", TrustLevel.TRUST_GOOD),
            Worker(28, 33, "Oleksander", "m", "Company1","", "https://randomuser.me/api/portraits/men/23.jpg", TrustLevel.TRUST_GOOD)
        )    }
}
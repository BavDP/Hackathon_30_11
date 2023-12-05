package com.example.hackathon_30_11.model
data class Worker(
    var id: Int = -1,
    var age: Int = -1,
    var name: String = "",
    var gender: String = "",
    var company: String = "",
    var phone: String = "",
    var photoUrl: String = "",
    var trustLevel: TrustLevel? = null
    ) {
    fun assign(source: Worker?): Worker {
        if (source != null) {
            id = source.id
            age = source.age
            name = source.name
            gender = source.gender
            company = source.company
            phone = source.phone
            photoUrl = source.photoUrl
            trustLevel = source.trustLevel
        }
        return this
    }
}
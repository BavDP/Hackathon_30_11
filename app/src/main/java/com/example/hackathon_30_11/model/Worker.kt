package com.example.hackathon_30_11.model

import java.io.Serializable

data class Worker(
    var id: Int,
    var age: Int,
    var name: String,
    var gender: String,
    var company: String,
    var email: String,
    var photoUrl: String,
    var trustLevel: TrustLevel
    ) {}
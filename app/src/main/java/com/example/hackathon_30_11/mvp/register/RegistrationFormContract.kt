package com.example.hackathon_30_11.mvp.register

import com.example.hackathon_30_11.model.Worker

interface RegistrationFormContract {
    interface View {
        fun showRegistrationFormError(errorMessage: String)
    }

    interface Represent {
        fun registerButtonClick(login: String, password: String, passwordVerify: String): Boolean;
    }

    interface Model {
        fun saveUserRegistrationData(login: String, password: String)
        fun isUserAuthorized(): Boolean
    }
}
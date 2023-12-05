package com.example.hackathon_30_11.mvp.register

object RegisterModel: RegistrationFormContract.Model {
    private var userLogin: String = ""
    private var  userPassword: String = ""
    override fun saveUserRegistrationData(login: String, password: String) {
        userLogin = login
        userPassword = password
    }

    override fun isUserAuthorized(): Boolean = !userLogin.isEmpty() && !userPassword.isEmpty()
}
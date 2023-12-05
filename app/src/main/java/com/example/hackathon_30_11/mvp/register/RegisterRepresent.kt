package com.example.hackathon_30_11.mvp.register

class RegisterRepresent(val view: RegistrationFormContract.View): RegistrationFormContract.Represent {
    private val model = RegisterModel
    override fun registerButtonClick(
        login: String,
        password: String,
        passwordVerify: String
    ): Boolean {
            // выполняем проверку данных от формы регистрации и если что-то не так, то
            // посылаем вьюшке сообщение об ошибке
            var errorMsg = ""
            if (login.isEmpty()) errorMsg = "Login is required!"
            else if (password.isEmpty()) errorMsg = "Password is required"
            else if (passwordVerify.isEmpty()) errorMsg = "The password must be repeated to verify it"
            else if (!password.equals(passwordVerify)) errorMsg = "Password error"
            else if (password.length < 6) errorMsg = "Minimum password length is 6 characters"
            else if (login.filter { char -> !char.isLetter() || char.isUpperCase() }.isNotEmpty()) {
                errorMsg = "Login can only consist of small letters"
            }
            view.showRegistrationFormError(if (!errorMsg.isEmpty()) errorMsg else "")
            val isOk = errorMsg.isEmpty()
            if (isOk) model.saveUserRegistrationData(login, password)
            return isOk
        }
}
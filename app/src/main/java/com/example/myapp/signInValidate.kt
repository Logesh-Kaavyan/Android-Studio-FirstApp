package com.example.myapp

object signInValidate {

    private val existingUsers = listOf("Logesh", "Kaavyan")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username EXISTS in existingUsers
     * ...the password contains less than 1 digits
     */
    fun validateInput(
        username: String,
        password: String,
    ): Boolean {
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(username !in existingUsers) {
            return false
        }
        if(password.count { it.isDigit() } < 1) {
            return false
        }
        return true
    }
}
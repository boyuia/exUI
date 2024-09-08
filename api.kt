package com.example.exui

object ApiService {
    suspend fun fetchUserData(userId: Int) {
        // Replace with your actual API call implementation
        val response = withContext(Dispatchers.IO) {
            // Make a network request to fetch user data
        }
        return response.body() ?: throw Exception("Failed to fetch user data")
    }

    private fun withContext(io: Any, function: () -> Unit) {

    }
}

private fun Any.body() {

}

class Dispatchers {
    object IO {

    }

}

class User {

}

package com.example.chatapp.data.remote

import com.example.chatapp.domin.model.Message

interface MessageService {
    suspend fun getAllMessages():List<Message>
    companion object{
        const val BASE_URL="http://192.168.1.7:8082"
    }
    sealed class Endpoint(val url:String){
        object GetAllMessages:Endpoint("$BASE_URL/messages")
    }
}
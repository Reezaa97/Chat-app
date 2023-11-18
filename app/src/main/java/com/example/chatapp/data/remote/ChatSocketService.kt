package com.example.chatapp.data.remote

import com.example.chatapp.domin.model.Message
import com.example.chatapp.utill.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(username:String):Resource<Unit>
    suspend fun sendMessage(message:String)
    suspend fun observeMessages(): Flow<Message>
    suspend fun closeSession()
    companion object{
        const val BASE_URL="ws://192.168.1.7:8082"
    }
    sealed class Endpoint(val url:String){
        object ChatSocket:Endpoint("$BASE_URL/chat-socket")
    }
}
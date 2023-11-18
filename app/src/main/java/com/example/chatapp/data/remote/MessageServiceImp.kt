package com.example.chatapp.data.remote

import com.example.chatapp.data.remote.dto.MessageDto
import com.example.chatapp.domin.model.Message
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class MessageServiceImp(
    private val client: HttpClient
) : MessageService {
    override suspend fun getAllMessages(): List<Message> {
        return try {
            client.get<List<MessageDto>>(MessageService.Endpoint.GetAllMessages.url)
                .map { it.toMessage() }


        } catch (e: Exception) {
            emptyList()
        }
    }
}
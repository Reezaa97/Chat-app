package com.example.chatapp.presentation.chat


data class ChatState(
    val message: List<com.example.chatapp.domin.model.Message> = emptyList(),
    val isLoading: Boolean = false
)

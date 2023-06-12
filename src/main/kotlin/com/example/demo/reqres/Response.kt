package com.example.demo.reqres

import com.example.demo.model.Post

data class Response(
    val id: String,
    val title: String,
    val content: String,
    val userId: String,
) {
    companion object {
        fun from(post: Post) = Response(
            id = post.id,
            title = post.title,
            content = post.content,
            userId = post.userId,
        )
    }
}
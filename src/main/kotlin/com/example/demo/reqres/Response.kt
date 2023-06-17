package com.example.demo.reqres

import com.example.demo.model.Post

data class Response(
    val id: String,
    val title: String,
    val bookId: String,
    val authorId: String,
    val authorName: String,
) {
    companion object {
        fun from(post: Post) = Response(
            id = post.id,
            title = post.title,
            authorId = post.authorId,
            bookId = post.bookId,
            authorName = post.authorName,
        )
    }
}
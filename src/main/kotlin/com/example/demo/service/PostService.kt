package com.example.demo.service

import com.example.demo.model.Post
import com.example.demo.reqres.Request
import com.example.demo.repository.PostRepository
import com.example.demo.reqres.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService @Autowired constructor(private val repository: PostRepository): PostServiceInterface {

    override fun create(request: Request): Response {
    val user = repository.save(
        Post(
            title = request.title,
            bookId = request.bookId,
            authorId = request.authorId,
            authorName = request.authorName,
        )
    )
    return Response.from(user)
    }
}
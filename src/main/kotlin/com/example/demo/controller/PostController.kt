package com.example.demo.controller

import com.example.demo.reqres.Request
import com.example.demo.service.PostServiceInterface
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("posts")
class PostController {

    @Autowired
    lateinit var service: PostServiceInterface

    @PostMapping()
    fun create(@RequestBody request: Request): ResponseEntity<Any> {
        service.create(request)
        return ResponseEntity.ok().build()
    }
}